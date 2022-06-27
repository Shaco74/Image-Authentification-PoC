package com.example.image_auth_fk;

import org.apache.commons.codec.binary.Base64;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Converter {
    private String imagePath;

    public Converter(String imagePath) {
        this.imagePath = imagePath;
    }

    public Converter() {}

    public void decode() {
        if (!isPathSet()) {
            System.out.println("no image path set!");
            return;
        }
        try {
            // Reading File as input
            File file = new File("resources/encodedImg.txt");
            byte[] bFile = new byte[(int) file.length()];
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bFile);
            fileInputStream.close();

            //decoding input
            Base64 base64 = new Base64();
            byte[] decodedBytes = base64.decode(bFile);

            Files.write(Paths.get("resources/decodedImg.jpeg"), decodedBytes);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void encode() {
        if (!isPathSet()) {
            System.out.println("no image path set!");
            return;
        }
        try {
            // Reading File as input
            File file = new File(imagePath);
            byte[] bFile = new byte[(int) file.length()];
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bFile);
            fileInputStream.close();

            //encoding input
            Base64 base64 = new Base64();
            byte[] decodedBytes = base64.encode(bFile);
            Files.write(Paths.get("resources/encodedImg.txt"), decodedBytes);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean isPathSet() {
        if (imagePath == null)
            return false;

        return true;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}

