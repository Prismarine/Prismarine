package org.prismarine.server;

public class Prismarine {

    private static Server server;

    public static void main(String[] options) {
        server = new Server();
        server.init(options);
    }

    public static Server getServer(){
        return server;
    }
}
