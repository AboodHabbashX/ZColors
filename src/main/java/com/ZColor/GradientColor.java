package com.ZColor;

import com.ZColor.format.ColorFormatter;


public class GradientColor {

    private int red;
    private int green;
    private int blue;
    private final String RGB = String.format("Red: %d , Green: %d , Blue: %d", red ,green,blue);


    public GradientColor(int red ,int green , int blue){
        this.red=red;
        this.green=green;
        this.blue=blue;
    }

    public String createGradientText(String text){

        if (text == null || text.isEmpty())
            throw new IllegalArgumentException("java.lang.String text is empty");

        StringBuilder builder =new StringBuilder();

        int textLength = text.length();

        for (int i = 0; i < textLength; i++) {
            double gradientFactory = (double) i / (textLength - 1);

            int red = (int) (this.red * gradientFactory);
            int green = (int) (this.green* (1 - gradientFactory));
            int blue = this.blue;

            builder.append(ColorFormatter.RGBFormat(red ,green,blue)).append(text.charAt(i));
        }
        return builder + Color.RESET;
    }

    public String createGradientBackground(int r , int g ,int b ,String text) {

        if (text == null || text.isEmpty())
            throw new IllegalArgumentException("java.lang.String text is empty");

        StringBuilder builder =new StringBuilder();

        int textLength=text.length();

        for (int i = 0; i < textLength; i++) {
            double gradientFactory = (double) i / (textLength - 1);

            int red = (int) (r * gradientFactory);
            int green = (int) (g * (1 - gradientFactory));

            builder.append(ColorFormatter.backgroundRGBFormat(red ,green, b)).append(text.charAt(i));
        }
        return builder +createGradientText(text)+Color.RESET;
    }

    public String createGradientBackground(Color color ,String text) {

        if (color ==null) throw new IllegalArgumentException("class Color is Null");
        if (text.isEmpty()) throw new IllegalArgumentException("java.lang.String text is Empty");

        int[] number = ColorFormatter.ansiToRGB(color.color());
        return createGradientBackground(number[0],number[1],number[2],text);
    }

    public String getRGB() {
        return RGB;
    }

    @Override
    public String toString() {
        return "[%d,%d,%d]".formatted(red,green,blue);
    }
}
