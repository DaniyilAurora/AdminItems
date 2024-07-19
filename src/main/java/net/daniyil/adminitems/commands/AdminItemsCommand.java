package net.daniyil.adminitems.commands;

import net.daniyil.adminitems.AdminItems;
import net.daniyil.adminitems.instances.AdminItemsGui;
import net.daniyil.adminitems.utils.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class AdminItemsCommand implements CommandExecutor {
    private final FileConfiguration config = AdminItems.getPlugin().getConfig();

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (commandSender.hasPermission(config.getString("admin-permission"))) {
                player.openInventory(AdminItemsGui.getGui());
                player.sendMessage(Utils.applyColors("&aOpened AdminItems GUI."));
            }
            else {
                player.sendMessage(Utils.applyColors("&cYou don't have permission to use this command."));
            }
        }
        else {
            commandSender.sendMessage(Utils.applyColors("&cYou need to be player to execute this command."));
        }

        return false;
    }
}
