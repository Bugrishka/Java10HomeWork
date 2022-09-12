package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldIncreaseIfTheVolumeZero() {
        Radio volume = new Radio();

        volume.currentVolume = 0;

        int expected = 1;
        int actual = volume.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseIfTheVolumeOne() {
        Radio volume = new Radio();

        volume.currentVolume = 1;

        int expected = 2;
        int actual = volume.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseIfTheVolumeNegativeValue() {
        Radio volume = new Radio();

        volume.currentVolume = -1;

        int expected = 0;
        int actual = volume.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseIfTheVolumeNine() {
        Radio volume = new Radio();

        volume.currentVolume = 9;

        int expected = 10;
        int actual = volume.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseIfTheVolumeTen() {
        Radio volume = new Radio();

        volume.currentVolume = 10;

        int expected = 0;
        int actual = volume.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseIfTheVolumeEleven() {
        Radio volume = new Radio();

        volume.currentVolume = 11;

        int expected = 0;
        int actual = volume.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseIfTheVolumeNegativeValue() {
        Radio volume = new Radio();

        volume.currentVolume = -1;

        int expected = 0;
        int actual = volume.turnDownTheVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseIfTheVolumeZero() {
        Radio volume = new Radio();

        volume.currentVolume = 0;

        int expected = 0;
        int actual = volume.turnDownTheVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseIfTheVolumeOne() {
        Radio volume = new Radio();

        volume.currentVolume = 1;

        int expected = 0;
        int actual = volume.turnDownTheVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseIfTheVolumeNine() {
        Radio volume = new Radio();

        volume.currentVolume = 9;

        int expected = 8;
        int actual = volume.turnDownTheVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseIfTheVolumeTen() {
        Radio volume = new Radio();

        volume.currentVolume = 10;

        int expected = 9;
        int actual = volume.turnDownTheVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseIfTheVolumeEleven() {
        Radio volume = new Radio();

        volume.currentVolume = 11;

        int expected = 0;
        int actual = volume.turnDownTheVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextStationIfNowZeroStation() {
        Radio station = new Radio();

        station.currentRadioStation = 0;

        int expected = 1;
        int actual = station.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextStationIfNowFifthStation() {
        Radio station = new Radio();

        station.currentRadioStation = 5;

        int expected = 6;
        int actual = station.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextStationIfNowNinthStation() {
        Radio station = new Radio();

        station.currentRadioStation = 9;

        int expected = 0;
        int actual = station.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextStationIfNowTenStation() {
        Radio station = new Radio();

        station.currentRadioStation = 10;

        int expected = 0;
        int actual = station.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePrevStationIfNowZeroStation() {
        Radio station = new Radio();

        station.currentRadioStation = 0;

        int expected = 9;
        int actual = station.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePrevStationIfNowFifthStation() {
        Radio station = new Radio();

        station.currentRadioStation = 5;

        int expected = 4;
        int actual = station.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePrevStationIfNowNinthStation() {
        Radio station = new Radio();

        station.currentRadioStation = 9;

        int expected = 8;
        int actual = station.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePrevStationIfNowTenStation() {
        Radio station = new Radio();

        station.currentRadioStation = 10;

        int expected = 0;
        int actual = station.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchStationToZero() {
        Radio station = new Radio();

        station.setCurrentRadioStation(0);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchStationToFifth() {
        Radio station = new Radio();

        station.setCurrentRadioStation(5);

        int expected = 5;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchStationToNinth() {
        Radio station = new Radio();

        station.setCurrentRadioStation(9);

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchStationToTen() {
        Radio station = new Radio();

        station.setCurrentRadioStation(10);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}