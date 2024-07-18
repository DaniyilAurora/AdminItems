package net.daniyil.adminitems.events;

import net.daniyil.adminitems.instances.GrapplingHookItem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.util.Vector;

public class GrapplingHookUsedEvent implements Listener {
    @EventHandler
    public void onGrapplingHookUse(PlayerFishEvent e) {
        Player p = e.getPlayer();

        if (p.getItemInHand().equals(GrapplingHookItem.getItem())) {
            if (e.getState().equals(PlayerFishEvent.State.REEL_IN)) {
                Vector move = e.getHook().getLocation().subtract(p.getLocation()).toVector();
                p.setVelocity(move.multiply(0.3));
            }
        }
    }
}
