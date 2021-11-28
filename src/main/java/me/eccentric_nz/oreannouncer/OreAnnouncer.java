package me.eccentric_nz.oreannouncer;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class OreAnnouncer extends JavaPlugin {

    private final OreCounter oreCounter = new OreCounter(this);
    private final OreBroadcast oreBroadcast = new OreBroadcast(this);

    @Override
    public void onDisable() {
        // Place any custom disable code here.
    }

    @Override
    public void onEnable() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new OreAnnouncerListener(this), this);
    }

    public OreCounter getOreCounter() {
        return oreCounter;
    }

    public OreBroadcast getOreBroadcast() {
        return oreBroadcast;
    }
}