package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task5Test {

    @Test
    @DisplayName("Проверяем 11211230 ➞ true")
    void test1() {
        int arg1 = 11211230;
        boolean correct = true;
        Assertions.assertEquals(Task5.isPalindromeDescendant(arg1), correct);
    }

    @Test
    @DisplayName("Нечетное количество цифр")
    void test2() {
        int arg1 = 112;
        boolean correct = true;
        Assertions.assertEquals(Task5.isPalindromeDescendant(arg1), correct);
    }

    @Test
    @DisplayName("Однозначное число")
    void test3() {
        int arg1 = 1;
        boolean correct = false;
        Assertions.assertEquals(Task5.isPalindromeDescendant(arg1), correct);
    }


}
