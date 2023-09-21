package com.ZColor;

import com.ZColor.format.ColorFormatter;


@SuppressWarnings("unused")
public class Color implements com.ZColor.Storage.Colors {

    private volatile String Colors;
    private GradientColor gradientColor;

    /*
     ANSI escape codes, which are special sequences of characters that control various
     text formatting options, including color. These codes are supported by most modern terminal emulators.
     */


    public Color(int r ,int g ,int b) { // add your Custom Color
        Colors = ColorFormatter.RGBFormat(r,g,b);
    }
    public Color(String color){
        Colors = color;
    }
    public Color(GradientColor gradientColor){
     this.gradientColor=gradientColor;
    }


    public String color() {
        return Colors;
    }

    public GradientColor getGradientColor() {
        return gradientColor;
    }
}
