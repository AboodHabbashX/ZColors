package com.ZColor;


@SuppressWarnings("unused")
public class ColoringText {

    private static final String[] colors = {Color.BRIGHT_RED, Color.ORANGE, Color.YELLOW,
            Color.LIME_GREEN, Color.BRIGHT_CYAN, Color.BLUE, Color.PURPLE};


    @Deprecated(forRemoval = true)
    public ColoringText() {}

    public static String createRainbowText(String text) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            builder.append(coloring(i, colors)).append(text.charAt(i));

        }
        return builder.toString();
    }

    public static String createColoredText(String text, String[] colorsArray) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            builder.append(coloring(i, colorsArray)).append(text.charAt(i));
        }
        return builder.toString();
    }


    private static String coloring(int index, String[] colors) {
        if (index < colors.length) {
            return colors[index];
        }
        return coloring(index - colors.length, colors);
    }

    @Deprecated(since ="1.1")
    public String createTwoColorText(String text,String color1, String color2){
        StringBuilder stringBuilder =new StringBuilder();
        for (int i = 0 ;i<text.length(); i++) {
            if (i % 2 == 0){
                stringBuilder.append(color1).append(text.charAt(i));
            }else {
                stringBuilder.append(color2).append(text.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
