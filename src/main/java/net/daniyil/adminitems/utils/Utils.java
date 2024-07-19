package net.daniyil.adminitems.utils;

public class Utils {

    // Changes color symbol & to §, to make color text.
    public static String applyColors(String text) {
        return text.replace('&', '§');
    }
}
