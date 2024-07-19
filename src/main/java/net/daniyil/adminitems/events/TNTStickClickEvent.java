package net.daniyil.adminitems.events;

import net.daniyil.adminitems.instances.TntStickItem;
import net.daniyil.adminitems.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class TNTStickClickEvent implements Listener {
    @EventHandler
    public void onTNTStickClick(PlayerInteractEvent e) {
        Player player = e.getPlayer();

        if (player.getItemInHand().equals(TntStickItem.getItem())) {
            player.sendMessage(Utils.applyColors("&aSend TNT!"));

            Entity tnt = Bukkit.getWorld("world").spawn(player.getLocation(), TNTPrimed.class);
            tnt.setVelocity(player.getLocation().getDirection().multiply(2));
            ((TNTPrimed)tnt).setFuseTicks(80);
        }
    }
}
