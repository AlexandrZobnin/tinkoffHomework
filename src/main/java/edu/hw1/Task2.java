package edu.hw1;

class Task2 {

    private Task2() {}

    private final static double CONSTANT_FOR_ROUND = 0.5;

    static int countDigits(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        return (int) Math.ceil(Math.log10(number + CONSTANT_FOR_ROUND));
    }
}
