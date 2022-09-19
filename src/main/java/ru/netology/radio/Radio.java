package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
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
        if (currentVolume < 10) {
            currentVolume ++;
        }
    }
    public void turnDownTheVolume() {
        if (currentVolume <= 0) {
            return;
        }
        currentVolume --;

    }

    public void nextStation () {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation ++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevStation () {
        if (currentRadioStation > 0) {
            currentRadioStation --;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public Radio() {
        maxRadioStation = 9;
    }

    public Radio(int stationCount) {
        maxRadioStation = stationCount - 1;
    }
}
