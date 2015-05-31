package org.prismarine.server;

public class Prismarine {

    private static Server server;
    private static String prismarineVersion = "Prismarine-1.8.6 v0.1";

    public static void main(String[] options) {
        server = new Server();
        server.init(options);
    }

    public static Server getServer(){
        return server;
    }

    public static String getPrismarineVersion(){
        return prismarineVersion;
    }
}
