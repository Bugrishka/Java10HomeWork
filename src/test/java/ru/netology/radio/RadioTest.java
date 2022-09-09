package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldIncreaseIfTheVolume0() {
        Radio volume = new Radio();

        volume.currentVolume = 0;

        int expected = 1;
        int actual = volume.increaseVolume;

        Assertions.assertEquals(expected, actual);
    }
}