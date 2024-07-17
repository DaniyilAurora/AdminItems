package net.daniyil.adminitems.utils;

public class Utils {

    // Changes color symbol & to §, to make color text.
    public static String changeColors(String text) {
        return text.replace('&', '§');
    }
}
