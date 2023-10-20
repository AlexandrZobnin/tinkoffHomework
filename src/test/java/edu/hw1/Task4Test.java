package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4Test {

    @Test
    @DisplayName("Исправляем \"123456\" ➞ \"214365\"")
    void test1() {
        String arg1 = "123456";
        String correct = "214365";
        Assertions.assertEquals(Task4.fixString(arg1), correct);
    }

    @Test
    @DisplayName("\"badce\" ➞ \"abcde\"")
    void test2() {
        String arg1 = "badce";
        String correct = "abcde";
        Assertions.assertEquals(Task4.fixString(arg1), correct);
    }
}
