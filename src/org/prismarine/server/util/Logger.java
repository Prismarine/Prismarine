package org.prismarine.server.util;

public class Logger {

    /**
     * Sends a debug message to the console.
     *
     * @param msg The debug message to send
     */
    public static void debug(String msg){
        System.out.println("[Prismarine][DEBUG] " + msg);
    }

    /**
     * Sends an info message to the console.
     *
     * @param msg The info message to send
     */
    public static void write(String msg){
        System.out.println("[Prismarine] " + msg);
    }

    /**
     * Sends an error message to the console.
     *
     * @param msg The error message to send
     */
    public static void error(String msg){
        System.out.println("[Prismarine] " + msg);
    }
}
