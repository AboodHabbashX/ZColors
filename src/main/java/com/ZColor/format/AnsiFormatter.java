package com.ZColor.format;


public class AnsiFormatter {
    public static String hexToAnsi(String hexColorCode) {

        int[] ansiColors = {0, 1, 2, 3, 4, 5, 6, 7};


        int hexRed = Integer.parseInt(hexColorCode.substring(1, 3), 16);
        int hexGreen = Integer.parseInt(hexColorCode.substring(3, 5), 16);
        int hexBlue = Integer.parseInt(hexColorCode.substring(5, 7), 16);

        int closestColor = findClosestColor(hexRed, hexGreen, hexBlue, ansiColors);



        return "\u001B[" + (30 + closestColor) + "m";
    }

    public static int findClosestColor(int red, int green, int blue, int[] ansiColors) {
        int closestColor = 0;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < ansiColors.length; i++) {
            int ansiColor = ansiColors[i];
            int ansiRed = (ansiColor & 1) * 255;   // Bit 0 represents red
            int ansiGreen = ((ansiColor >> 1) & 1) * 255; // Bit 1 represents green
            int ansiBlue = ((ansiColor >> 2) & 1) * 255;  // Bit 2 represents blue


            int distance = (red - ansiRed) * (red - ansiRed) +
                    (green - ansiGreen) * (green - ansiGreen) +
                    (blue - ansiBlue) * (blue - ansiBlue);

            if (distance < minDistance) {
                minDistance = distance;
                closestColor = ansiColor;
            }
        }
        return closestColor;
    }
}
