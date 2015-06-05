package org.prismarine.server.util;

import com.google.gson.Gson;

import java.io.FileReader;

public class AdvancedSettings {

    public FileReader file;
    private Gson gson;

    public AdvancedSettings(FileReader fr){
        this.file = fr;
        this.gson = new Gson();
    }

    private void deserialize(){

    }
}
