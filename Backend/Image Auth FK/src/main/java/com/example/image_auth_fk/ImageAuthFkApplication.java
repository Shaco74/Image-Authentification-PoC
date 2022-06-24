package com.example.image_auth_fk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@SpringBootApplication
@RestController
public class ImageAuthFkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImageAuthFkApplication.class, args);
        File_Reader fr= new File_Reader("resources/imageKey.jpeg");
        System.out.println(fr.getPath());
        try {
            File initialFile = new File("resources/imageKey.jpeg");

            final InputStream targetStream = new DataInputStream(new FileInputStream(initialFile));

            // Count the total bytes form the input stream
            int streamLength = targetStream.available();

            // Create byte array
            byte[] byteArr = new byte[streamLength];

            // Read data into byte array
            int bytes = targetStream.read(byteArr);

            for (byte by : byteArr) {
                // Print the character
                System.out.print((char)by);
            }
            System.out.println("finished");
        }catch (Exception e){
            System.out.println("Image couldn't be read");
            System.out.println(e);
        }
    }

    @GetMapping
    public String hello(){
        return "Hello World";
    }
}