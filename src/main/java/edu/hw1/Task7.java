package edu.hw1;




class Task7 {

    private Task7() {}

    public static int rotateLeft(int n, int shift) {

        if (n == 1 || n == 0) {
            return n;
        }
        int[] binaryArray = intToBinaryArray(n);

        int temp = binaryArray[binaryArray.length - 1];
        for (int i = 0; i < shift; i++) {
            for (int j = binaryArray.length - 1; j > 0; j--) {
                binaryArray[binaryArray.length - 1] = binaryArray[j - 1];
                binaryArray[j - 1] = temp;
                temp = binaryArray[binaryArray.length - 1];
            }
        }
        return binaryArrayToInt(binaryArray);
    }

    public static int rotateRight(int n, int shift) {

        if (n == 1 || n == 0) {
            return n;
        }
        int[] binaryArray = intToBinaryArray(n);

        int temp = binaryArray[0];
        for (int i = 0; i < shift; i++) {
            for (int j = 0; j < binaryArray.length - 1; j++) {
                binaryArray[0] = binaryArray[j + 1];
                binaryArray[j + 1] = temp;
                temp = binaryArray[0];
            }
        }

        return binaryArrayToInt(binaryArray);
    }


    public static double log2(int x) {
        return Math.log(x) / Math.log(2);
    }

    public static int[] intToBinaryArray(int number) {
        int copyNumber = number;
        int countDigits = (copyNumber != 0) ? (int) Math.ceil(log2(number)) : 1;
        int[] binaryDigits = new int[countDigits];
        for (int i = 0; i < countDigits; i++) {
            binaryDigits[countDigits - i - 1] = copyNumber % 2;
            copyNumber /= 2;
        }
        return binaryDigits;
    }

    public static int binaryArrayToInt(int[] binaryArray) {
        int number = 0;
        for (int i = 0; i < binaryArray.length; i++) {
            number *= 2;
            number += binaryArray[i];
        }
        return number;
    }
}

