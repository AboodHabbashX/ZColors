package com.Abood.Colors;

import com.Abood.format.ColorFormat;


public class Color {

    private volatile String Color;
    private GradientColor gradientColor;

    /*
     ANSI escape codes, which are special sequences of characters that control various
     text formatting options, including color. These codes are supported by most modern terminal emulators.
     */

    // Foreground Colors
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String BRIGHT_BLACK = "\u001B[30;1m";
    public static final String BRIGHT_RED = "\u001B[31;1m";
    public static final String BRIGHT_GREEN = "\u001B[32;1m";
    public static final String BRIGHT_YELLOW = "\u001B[33;1m";
    public static final String BRIGHT_BLUE = "\u001B[34;1m";
    public static final String BRIGHT_PURPLE = "\u001B[35;1m";
    public static final String BRIGHT_CYAN = "\u001B[36;1m";
    public static final String BRIGHT_WHITE = "\u001B[37;1m";
    public static final String ORANGE = "\u001B[38;5;202m";
    public static final String PINK = "\u001B[38;5;206m";
    public static final String SKY_BLUE = "\u001B[38;5;111m";
    public static final String LIME_GREEN = "\u001B[38;5;154m";
    public static final String LAVENDER = "\u001B[38;5;183m";
    public static final String MAROON = "\u001B[38;5;52m";
    public static final String GRAY = "\u001B[90m";
    public static final String BRIGHT_GRAY = "\u001B[97;1m";
    public static final String BG_GRAY = "\u001B[100m";


    // Background Colors
    public static final String BG_BLACK = "\u001B[40m";
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_PURPLE = "\u001B[45m";
    public static final String BG_CYAN = "\u001B[46m";
    public static final String BG_WHITE = "\u001B[47m";
    public static final String BG_BRIGHT_BLACK = "\u001B[40;1m";
    public static final String BG_BRIGHT_RED = "\u001B[41;1m";
    public static final String BG_BRIGHT_GREEN = "\u001B[42;1m";
    public static final String BG_BRIGHT_YELLOW = "\u001B[43;1m";
    public static final String BG_BRIGHT_BLUE = "\u001B[44;1m";
    public static final String BG_BRIGHT_PURPLE = "\u001B[45;1m";
    public static final String BG_BRIGHT_CYAN = "\u001B[46;1m";
    public static final String BG_BRIGHT_WHITE = "\u001B[47;1m";
    public static final String BG_ORANGE = "\u001B[48;5;202m";
    public static final String BG_PINK = "\u001B[48;5;206m";
    public static final String BG_SKY_BLUE = "\u001B[48;5;111m";
    public static final String BG_LIME_GREEN = "\u001B[48;5;154m";
    public static final String BG_LAVENDER = "\u001B[48;5;183m";
    public static final String BG_MAROON = "\u001B[48;5;52m";
    public static final String BG_BRIGHT_GRAY = "\u001B[107;1m";


    public Color(int r ,int g ,int b) { // add your Custom Color
        Color = ColorFormat.RGBFormat(r,g,b);
    }
    public Color(String color){
        Color = color;
    }
    public Color(GradientColor gradientColor){
     this.gradientColor=gradientColor;
    }


    public String color() {
        return Color;
    }

    public GradientColor getGradientColor() {
        return gradientColor;
    }
}
