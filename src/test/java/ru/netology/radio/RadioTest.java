package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldIncreaseIfTheVolumeZero() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.turnUpTheVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseIfTheVolumeOne() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        volume.turnUpTheVolume();

        int expected = 2;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseIfTheVolumeNegativeValue() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseIfTheVolumeFive() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);

        volume.turnUpTheVolume();

        int expected = 6;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseIfTheVolumeNine() {
        Radio volume = new Radio();
        volume.setCurrentVolume(9);

        volume.turnUpTheVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseIfTheVolumeTen() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);

        volume.turnUpTheVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseIfTheVolumeNegativeValue() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);

        volume.turnDownTheVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseIfTheVolumeZero() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.turnDownTheVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseIfTheVolumeOne() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        volume.turnDownTheVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseIfTheVolumeNine() {
        Radio volume = new Radio();
        volume.setCurrentVolume(9);

        volume.turnDownTheVolume();

        int expected = 8;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseIfTheVolumeTen() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);

        volume.turnDownTheVolume();

        int expected = 9;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseIfTheVolumeEleven() {
        Radio volume = new Radio();
        volume.setCurrentVolume(11);

        volume.turnDownTheVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextStationIfNowMinusOneStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextStationIfNowZeroStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);

        station.nextStation();

        int expected = 1;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextStationIfNowFifthStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(1);

        station.nextStation();

        int expected = 2;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextStationIfNowNinthStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);

        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePrevStationIfNowZeroStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);

        station.prevStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePrevStationIfNowFifthStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(5);

        station.prevStation();

        int expected = 4;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePrevStationIfNowNinthStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);

        station.prevStation();

        int expected = 8;
        int actual = station.getCurrentRadioStation();

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

    @Test
    public void shouldSwitchToTheNextStationIfRadioHasTwentyStations(){
        Radio station = new Radio(20);
        station.setCurrentRadioStation(15);

        station.nextStation();

        int expected = 16;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePrevStationIfRadioHasTwentyStations(){
        Radio station = new Radio(20);
        station.setCurrentRadioStation(15);

        station.prevStation();

        int expected = 14;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextStationIfRadioHasTwentyStationsAndNowLastStation(){
        Radio station = new Radio(20);
        station.setCurrentRadioStation(19);

        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePrevStationIfRadioHasTwentyStationsAndNowFirstStation(){
        Radio station = new Radio(20);
        station.setCurrentRadioStation(0);

        station.prevStation();

        int expected = 19;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}