package org.prismarine.server;

import org.prismarine.server.util.AdvancedSettings;
import org.prismarine.server.util.Logger;

import java.io.FileReader;

public class Prismarine {

    private static Server server;
    private static String prismarineVersion = "Prismarine-1.8.6 v0.1";
    private static AdvancedSettings config;

    public static void main(String[] options) {
        server = new Server();
        initConfig();
        server.init(options);
    }

    public static Server getServer(){
        return server;
    }

    public static String getPrismarineVersion(){
        return prismarineVersion;
    }

    private static void initConfig(){
        try {
            config = new AdvancedSettings(new FileReader("AdvancedSettings.json"));
        } catch (Exception ex){
            Logger.error("Could not find AdvancedSettings.json");
        }
    }

    public static AdvancedSettings getConfig(){
        return config;
    }
}
