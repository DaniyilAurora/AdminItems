package net.daniyil.adminitems.instances;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class AdminItemsGui {
    private static Inventory gui = Bukkit.createInventory(null, 27, "Admin Items");

    public static Inventory getGui() {
        gui.setItem(12, GrapplingHookItem.getItem());

        return gui;
    }
}
