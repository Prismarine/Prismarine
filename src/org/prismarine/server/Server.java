package org.prismarine.server;

import net.minecraft.server.MinecraftServer;
import org.prismarine.server.plugins.PluginManager;
import org.prismarine.server.util.Logger;

import java.io.File;

public class Server implements org.prismarine.api.Server{

    private static MinecraftServer nms;
    private static PluginManager pluginManager;

    public static void main(String[] _options) {
        try {
            //temporarily option to prevent using gui
            String[] options = new String[1 + _options.length];
            //convert _options to our new options here, TODO
            options[0] = "nogui";

            //log start
            Logger.write("Starting prismarine server");
            Logger.write("Loading Minecraft Server...");

            //always run minecraft server as the latest process
            //initialize the minecraft server
            MinecraftServer.main(options);
            nms = MinecraftServer.getServer();
            //TODO: put this in MinecraftServer.s() (Latest process after world reloading)
            //initialize plugins
            new PluginManager();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }


    @Override
    public int getMemoryUsage() {
        return 0;
    }

    @Override
    public int getServerUptime() {
        return 0;
    }

    @Override
    public String getMotd() {
        return nms.getMotd();
    }

    @Override
    public void reloadMotd() {
        //TODO: code motd property reloading
    }

    @Override
    public File getServerIcon() {
        return nms.d("server-icon.png");
    }

    @Override
    public void shutdown() {
        nms.safeShutdown();
    }

    @Override
    public void restart() {
        //TODO: implement Restart
    }

    @Override
    public boolean hasWhitelist() {
        //TODO: implement haswhitelist
        return false;
    }

    @Override
    public boolean getOnlineMode() {
        return nms.getOnlineMode();
    }

    @Override
    public boolean getPvpEnabled() {
        return nms.getPVP();
    }

    @Override
    public boolean getAnimalsSpawn() {
        return nms.getSpawnAnimals();
    }

    @Override
    public boolean getGenerateStructures() {
        return nms.getGenerateStructures();
    }

    @Override
    public boolean getAllowFlight() {
        return nms.getAllowFlight();
    }

    @Override
    public void setMotd(String s) {
        nms.setMotd(s);
    }

    @Override
    public String getServerVersion() {
        return nms.getVersion();
    }
}
