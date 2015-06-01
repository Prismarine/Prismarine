package org.prismarine.server.players;

import com.google.common.collect.Maps;
import net.minecraft.server.EntityPlayer;
import net.minecraft.server.PlayerList;
import org.prismarine.api.players.Player;

import java.util.Map;
import java.util.UUID;

public class PlayerManager {

    private Map<EntityPlayer, Player> players = Maps.newHashMap();
    private PlayerList nms;

    public PlayerManager(PlayerList nms){
        this.nms = nms;
    }

    public void addPlayer(EntityPlayer p){
        players.put(p, new PrismarinePlayer(p));
    }

    public Player getPlayer(UUID id){
        EntityPlayer _p = nms.a(id);
        return players.get(_p);
    }

    public Player getPlayer(String id){
        EntityPlayer _p = nms.getPlayer(id);
        return players.get(_p);
    }
}
