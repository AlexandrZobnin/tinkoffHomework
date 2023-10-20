package edu.hw1;

class Task5 {

    private Task5() {}

    private final static int TEN = 10;

    public static boolean isPalindrome(String word) {
        int length = word.length();

        for (int i = 0; i < (length / 2); i++) {

            if (word.charAt(i) != word.charAt(length - i - 1)) {

                return false;
            }
        }
        return true;
    }

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
            number *= TEN;
            number += digit;
        }
        return number;
    }


    public static boolean isPalindromeDescendant(int number) {
        int copyNumber = number;

        if (copyNumber < TEN) {
            return false;
        }

        String numberString = Integer.toString(copyNumber);

        if (Task5.isPalindrome(numberString)) {
            return true;
        }

        if (numberString.length() % 2 == 1) {
            copyNumber *= TEN;
        }

        int[] digits = intToArray(copyNumber);
        int[] newDigits = new int[digits.length / 2];

        for (int i = 0; i < newDigits.length; i++) {
            newDigits[i] = digits[2 * i] + digits[2 * i + 1];
        }

        return isPalindromeDescendant(Task5.arrayToInt(newDigits));
    }

}
