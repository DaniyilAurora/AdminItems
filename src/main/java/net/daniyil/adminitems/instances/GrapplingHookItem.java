package net.daniyil.adminitems.instances;

import net.daniyil.adminitems.utils.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GrapplingHookItem {
    private static ItemStack item = new ItemStack(Material.FISHING_ROD);
    private static ItemMeta itemMeta = item.getItemMeta();

    public static ItemStack getItem() {
        itemMeta.setDisplayName(Utils.changeColors("&aGrappling hook"));
        ArrayList<String> itemLore = new ArrayList<String>();
        itemLore.add(Utils.changeColors("&7Using this item you can jump really high!"));
        itemMeta.setLore(itemLore);
        itemMeta.setUnbreakable(true);
        item.setItemMeta(itemMeta);

        return item;
    }
}
