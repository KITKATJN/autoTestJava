package main;

import java.util.Arrays;

public class StringReverse {
    public static String stringReverse(String stringToReverse) {
        if (stringToReverse == null) {
            return null;
        }

        char[] charArray = stringToReverse.toCharArray();
        return reverseArray(charArray);
    }

    public static  String reverseArray(char[] charArray) {

            char[] arr = new char[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                arr[i] = charArray[charArray.length - 1 - i];
            }
        return new String(arr);
    }


}

