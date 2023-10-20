package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task3Test {

    @Test
    @DisplayName("{1,2,3,4} и {0,6}")
    void usualDataCheck() {
        int[] arg1 = new int[] {1, 2, 3, 4};
        int[] arg2 = new int[] {0, 6};
        boolean correct = true;
        Assertions.assertEquals(Task3.isNestable(arg1, arg2), correct);
    }

    @Test
    @DisplayName("Неупорядоченные массивы {3, 1} и {4, 0}")
    void unsortedArrays() {
        int[] arg1 = new int[] {1, 2, 3, 4};
        int[] arg2 = new int[] {0, 6};
        boolean correct = true;
        Assertions.assertEquals(Task3.isNestable(arg1, arg2), correct);
    }


@Test
@DisplayName("Массивы с одинаковыми элементами {9, 9, 8} и {8, 9}")
    void sameElements() {
        int[] arg1 = new int[] {9, 9, 8};
        int[] arg2 = new int[] {8, 9};
        boolean correct = false;
        Assertions.assertEquals(Task3.isNestable(arg1, arg2), correct);
        }
}
