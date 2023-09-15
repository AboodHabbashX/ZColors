package com.Abood.Colors;

import com.Abood.format.ColorFormat;


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
        StringBuilder builder =new StringBuilder();

        int textLength = text.length();

        for (int i = 0; i < textLength; i++) {
            double gradientFactory = (double) i / (textLength - 1);

            int red = (int) (this.red * gradientFactory);
            int green = (int) (this.green* (1 - gradientFactory));
            int blue = this.blue;

            builder.append(ColorFormat.RGBFormat(red ,green,blue)).append(text.charAt(i));
        }
        return builder +Color.RESET;
    }

    public String createGradientBackground(int r , int g ,int b ,String text) {
        StringBuilder builder =new StringBuilder();

        int textLength=text.length();

        for (int i = 0; i < textLength; i++) {
            double gradientFactory = (double) i / (textLength - 1);

            int red = (int) (r * gradientFactory);
            int green = (int) (g * (1 - gradientFactory));

            builder.append(ColorFormat.BackgroundRGBFormat(red ,green, b)).append(text.charAt(i));
        }
        return builder +createGradientText(text)+Color.RESET;
    }

    public String createGradientBackground(Color color ,String text) {

        int[] numbers = ColorFormat.convertAnsiToRGB(color.color());
        StringBuilder builder =new StringBuilder();

        int textLength=text.length();

        for (int i = 0; i < textLength; i++) {
            double gradientFactory = (double) i / (textLength - 1);

            int red = (int) (numbers[0] * gradientFactory);
            int green = (int) (numbers[1] * (1 - gradientFactory));

            builder.append(ColorFormat.BackgroundRGBFormat(red ,green, numbers[2])).append(text.charAt(i));
        }
        return builder +Color.RESET;
    }

    public String getRGB() {
        return RGB;
    }
}
