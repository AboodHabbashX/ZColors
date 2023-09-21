package com.ZColor.format;

import com.ZColor.Color;

public class HexFormatter {

    public static String ansiToHex(int red, int green, int blue) {

        red = Math.min(255, Math.max(0, red));
        green = Math.min(255, Math.max(0, green));
        blue = Math.min(255, Math.max(0, blue));


        String hexRed = Integer.toHexString(red);
        String hexGreen = Integer.toHexString(green);
        String hexBlue = Integer.toHexString(blue);


        hexRed = padWithZero(hexRed);
        hexGreen = padWithZero(hexGreen);
        hexBlue = padWithZero(hexBlue);

        return "#" + hexRed + hexGreen + hexBlue;
    }
    public static String ansiToHex(Color color) {
        int[] rgb = ColorFormatter.ansiToRGB(color.color());
        return ansiToHex(rgb[0],rgb[1],rgb[2]);
    }

    public static String padWithZero(String hexValue) {
        if (hexValue.length() == 1) {
            return "0" + hexValue;
        }
        return hexValue;
    }

    @Deprecated(forRemoval = true)
    public HexFormatter(){

    }
}
