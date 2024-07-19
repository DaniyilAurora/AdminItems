package net.daniyil.adminitems.instances;

import net.daniyil.adminitems.utils.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class TntStickItem {
    private static ItemStack item = new ItemStack(Material.STICK);
    private static ItemMeta itemMeta = item.getItemMeta();

    public static ItemStack getItem() {
        itemMeta.setDisplayName(Utils.applyColors("&cTNT Stick"));
        ArrayList<String> itemLore = new ArrayList<String>();
        itemLore.add(Utils.applyColors("&7Using this item you can throw tnt!"));
        itemMeta.setLore(itemLore);
        itemMeta.setUnbreakable(true);
        item.setItemMeta(itemMeta);

        return item;
    }
}
