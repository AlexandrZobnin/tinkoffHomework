package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task1Test {

    @Test
    @DisplayName("Двузначное количество минут и секунд")
    void usualDataCheck() {
        String datetime = "12:48";
        int correct = 768;
        Assertions.assertEquals(Task1.minutesToSeconds(datetime), correct);
    }

    @Test
    @DisplayName("Время с незначащими нулями")
    void insignificantZero() {
        String datetime = "01:08";
        int correct = 68;
        Assertions.assertEquals(Task1.minutesToSeconds(datetime), correct);
    }

    @Test
    @DisplayName("Некорректное количество секунд")
    void incorrectSeconds() {
        String datetime = "01:78";
        int correct = -1;
        Assertions.assertEquals(Task1.minutesToSeconds(datetime), correct);
    }




}
