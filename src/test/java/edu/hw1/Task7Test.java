package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task7Test {


    @Test
    @DisplayName("rotateLeft(17, 2) -> 6")
    void test1() {
        int arg1 = 17;
        int arg2 = 2;
        int correct = 6;
        Assertions.assertEquals(Task7.rotateLeft(arg1, arg2), correct);
    }

    @Test
    @DisplayName("rotateRight(1, 2) -> 1073741824")
    void test2() {
        int arg1 = 1;
        int arg2 = 2;
        int correct = 1;
        Assertions.assertEquals(Task7.rotateRight(arg1, arg2), correct);
    }
}
