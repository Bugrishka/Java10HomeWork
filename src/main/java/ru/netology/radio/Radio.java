package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void turnUpTheVolume() {
        if (currentVolume < 10 && currentVolume >= 0) {
            currentVolume ++;
        }
    }
    public void turnDownTheVolume() {
        if (currentVolume <= 10 && currentVolume > 0) {
            currentVolume --;
        }
    }

    public void nextStation () {
        if (currentRadioStation < 9) {
            currentRadioStation ++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevStation () {
        if (currentRadioStation > 0) {
            currentRadioStation --;
        } else {
            currentRadioStation = 9;
        }
    }
}
