package main;

import java.sql.SQLOutput;

public class StringReverse {

    /**
     * @param stringToReverse string for reverse
     * @return reversed string
     */
    public static String stringReverse(String stringToReverse) {
        if (stringToReverse == null) {
            return null;
        }

        char[] charArray = stringToReverse.toCharArray();
        reverseArray(charArray);
        printArray(charArray);
        return new String(charArray);
    }


    public static void reverseArray(char[] charArray) {
        {
            for (int i = charArray.length - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    char a = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = a;
                }
            }
        }
    }

    public static void printArray(char[] charArray) {
        for (char ii : charArray) {
            System.out.print(ii);
        }
        System.out.println();
    }

    // insert your code here
    // you need to convert string to array of chars and work with it
    // example("hello" -> "olleh")

}

