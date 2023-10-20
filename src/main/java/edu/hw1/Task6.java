package edu.hw1;

import java.util.Arrays;

class Task6 {

    private Task6() {}

    private final static int KAPREKAR_CONST = 6174;

    public static int[] intToArray(int number) {
        String numberString = Integer.toString(number);
        char[] charArray = numberString.toCharArray();

        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = Character.getNumericValue(charArray[i]);
        }
        return intArray;
    }

    public static int arrayToInt(int[] digitArray) {
        int number = 0;
        for (int digit : digitArray) {
            number *= 10;
            number += digit;
        }
        return number;
    }

    public static void reverseIntArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }


    public static int[] getModifiedNumbers(int number) {
        int copyOfNumber = number;
        int min;
        int max;
        int[] digitArray = Task6.intToArray(copyOfNumber);
        Arrays.sort(digitArray);
        min = Task6.arrayToInt(digitArray);
        Task6.reverseIntArray(digitArray);
        max = Task6.arrayToInt(digitArray);
        return new int[] {min, max};
    }

    public static int getCountIterations(int number) {

        int[] modifiedNumbers = Task6.getModifiedNumbers(number);
        int min =  modifiedNumbers[0];
        int max = modifiedNumbers[1];
        if (max - min == 0) {
            return -1;
        }
        int difference = max - min;
        if (difference == KAPREKAR_CONST) {
            return 1;
        } else {
            return 1 + Task6.getCountIterations(difference);
        }
    }


}

