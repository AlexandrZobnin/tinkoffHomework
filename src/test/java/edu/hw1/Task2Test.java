package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task2Test {

    @Test
    @DisplayName("Аргумент 0")
    void zeroArg() {
        int arg = 0;
        int correct = 1;
        Assertions.assertEquals(Task2.countDigits(arg), correct);
    }

    @Test
    @DisplayName("Отрицательное число")
    void negativeNumber() {
        int arg = -10;
        int correct = -1;
        Assertions.assertEquals(Task2.countDigits(arg), correct);
    }

    @Test
    @DisplayName("Шестизначное число")
    void sixDigitNumber() {
        int arg = 777777;
        int correct = 6;
        Assertions.assertEquals(Task2.countDigits(arg), correct);
    }
}
