package org.prismarine.server.players;

import net.minecraft.server.EntityPlayer;
import net.minecraft.server.FoodMetaData;
import org.prismarine.api.players.Gamemode;
import org.prismarine.api.players.Player;

import java.util.UUID;

public class PrismarinePlayer implements Player{

    private EntityPlayer player;

    public PrismarinePlayer(EntityPlayer player){
        this.player = player;
    }

    @Override
    public UUID getUUID() {
        return player.getUniqueID();
    }

    @Override
    public String getDisplayName() {
        return null;
    }

    @Override
    public void setDisplayname(String s) {

    }

    @Override
    public int getHealth() {
        //TODO: Move to LivingEntity
        return 0;
    }

    @Override
    public void setHealth(int i) {
        //TODO: Move to LivingEntity
    }

    @Override
    public int addHealth(int i) {
        //TODO: Move to LivingEntity
        return 0;
    }

    @Override
    public int getFood() {
        return player.getFoodData().getFoodLevel();
    }

    @Override
    public void setFood(int i) {
        player.getFoodData().a(i);
    }

    @Override
    public int addFood(int i, float saturation) {
        FoodMetaData food = player.getFoodData();
        food.eat(i, saturation);
        return food.getFoodLevel();
    }

    @Override
    public int getExperience() {
       return 0;
    }

    @Override
    public void setExperience(int i) {

    }

    @Override
    public int addExperience(int i) {
        return 0;
    }

    @Override
    public int getExpLevel() {
        return player.getExpToLevel();
    }

    @Override
    public void setExpLevel(int i) {

    }

    @Override
    public int addExpLevel(int i) {
        return 0;
    }

    @Override
    public boolean isOp() {
        return false;
    }

    @Override
    public void setOp(boolean b) {

    }

    @Override
    public int getArmorLevel() {
        //TODO: Move to LivingEntity
        return 0;
    }

    @Override
    public Gamemode getGameMode() {
        return Gamemode.NOT_SET;
    }

    @Override
    public void setGameMode(Gamemode gamemode) {

    }
}
