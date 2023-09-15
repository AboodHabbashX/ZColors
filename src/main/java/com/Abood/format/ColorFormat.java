package com.Abood.format;




public class ColorFormat {
    public static String RGBFormat(int r, int g, int b) {
        return String.format("\u001B[38;2;%d;%d;%dm", r, g, b);
    }
    public static String BackgroundRGBFormat(int r, int g, int b) {
        return String.format("\u001B[48;2;%d;%d;%dm", r, g, b);
    }

    public static int[] convertAnsiToRGB(String ANSI) {

        String []part1 = ANSI.split(";",2);
        String part2  = part1[1];
        String [] c =part2.split(";",2);
        String part3 = c[1];
        String []part4 =  part3.split("m");
        String part5 = part4[0];
        String [] part6 = part5.split("m");
        String  k = part6[0];
        String []part7 = k.split(";");

      return new int[] {
              Integer.parseInt(part7[0]), // RED
              Integer.parseInt(part7[1]), // GREEN
              Integer.parseInt(part7[2])  // BLUE
      };
    }

    @Deprecated(forRemoval = true)
    public ColorFormat(){}
}
