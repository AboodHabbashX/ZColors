package com.ZColor.format;


import com.ZColor.Exception.AnsiCodeException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorFormatter {

    private static final String []newArray =new String[3];

    public static String RGBFormat(int r, int g, int b) {
        return String.format("\u001B[38;2;%d;%d;%dm", r, g, b);
    }

    public static String backgroundRGBFormat(int r, int g, int b) {
        return String.format("\u001B[48;2;%d;%d;%dm", r, g, b);
    }

    public static int[] ansiToRGB(String ANSI) {

        int index = 0 ,counter = 0;

        Pattern pattern = Pattern.compile("(\\d+).");
        Matcher matcher = pattern.matcher(ANSI);

        String []array =new String[5] ;

        while (matcher.find()) {
            array[counter] = matcher.group(1);
            counter++;
        }
        checkArray();
        for (int i = 2 ;i<array.length ;i++) {
            newArray[index] = array[i];
            index++;
        }
        int []IntegerArray = new int[newArray.length];

        for (int i = 0 ; i<newArray.length ; i++) {
            IntegerArray[i] = Integer.parseInt(newArray[i]);
        }

      return IntegerArray;
    }

    public static String ansiToString(String ANSI){
        StringBuilder builder =new StringBuilder();
        int []array = ansiToRGB(ANSI);

        for (int i =0 ;i<array.length ; i++) {
            if (i <=1) {
                builder.append(array[i]).append(",");
            }else {
                builder.append(array[i]);
            }
        }

        return "["+builder+"]";
    }
    private static void checkArray(){
        for (String c : ColorFormatter.newArray){
            if (c ==null) {
                throw new AnsiCodeException("The ANSI Code must contain RGB Check the ANSI Code you entered");
            }
        }
    }

    @Deprecated(forRemoval = true)
    public ColorFormatter(){}
}
