package com.example.image_auth_fk;

import java.io.File;

public class File_Reader {
    public File getImageKey() {
        return imageKey;
    }

    public void setImageKey(File imageKey) {
        this.imageKey = imageKey;
    }

    private File imageKey;
    private String path;

    public File_Reader(String path){
         this.path= path;
    }
    public String getPath(){
        return path;
    }
    public void setPath(String pPath){
        path = pPath;
    }
}
