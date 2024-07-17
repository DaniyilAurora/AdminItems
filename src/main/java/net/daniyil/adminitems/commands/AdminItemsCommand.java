package net.daniyil.adminitems.commands;

import net.daniyil.adminitems.AdminItems;
import net.daniyil.adminitems.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class AdminItemsCommand implements CommandExecutor {
    FileConfiguration config = AdminItems.getPlugin().getConfig();

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player) {
            Player p = (Player) commandSender;

            if (commandSender.hasPermission(config.getString("admin-permission"))) {
                Inventory gui = Bukkit.createInventory(p, 27, "Admin Items");

                p.openInventory(gui);
                p.sendMessage(Utils.changeColors("&aOpened AdminItems GUI."));
            }
            else {
                p.sendMessage(Utils.changeColors("&cYou don't have permission to use this command."));
            }
        }
        else {
            commandSender.sendMessage(Utils.changeColors("&cYou need to be player to execute this command."));
        }

        return false;
    }
}
