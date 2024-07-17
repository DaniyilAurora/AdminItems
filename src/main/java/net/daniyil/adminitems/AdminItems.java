package net.daniyil.adminitems;

import net.daniyil.adminitems.commands.AdminItemsCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdminItems extends JavaPlugin {
    private static AdminItems plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        getCommand("adminitems").setExecutor(new AdminItemsCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static AdminItems getPlugin() {
        return plugin;
    }
}
