package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task6Test {

    @Test
    @DisplayName("6621 -> 5")
    void test1() {
        int arg1 = 6621;
        int correct = 5;
        Assertions.assertEquals(Task6.getCountIterations(arg1), correct);
    }

    @Test
    @DisplayName("1234 -> 3")
    void test2() {
        int arg1 = 1234;
        int correct = 3;
        Assertions.assertEquals(Task6.getCountIterations(arg1), correct);
    }

    @Test
    @DisplayName("Число из одинаковых цифр")
    void test3() {
        int arg1 = 6666;
        int correct = -1;
        Assertions.assertEquals(Task6.getCountIterations(arg1), correct);
    }

}

