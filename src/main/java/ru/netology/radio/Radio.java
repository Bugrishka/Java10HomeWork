package ru.netology.radio;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;


    public int increaseVolume() { //увеличивать громкость
        if (currentVolume < 10 && currentVolume >= 0) {
            currentVolume = currentVolume + 1;
            return currentVolume;
        }
        if (currentVolume >= 10 && currentVolume < 0) {
        }
        return 0;
    }

    public int turnDownTheVolume() { //уменьшить громкость
        if (currentVolume <= 10 && currentVolume > 0) {
            currentVolume = currentVolume - 1;
            return currentVolume;
        }
        if (currentVolume > 10 && currentVolume <= 0) {
        }
        return 0;
    }

    public int nextStation() {
        if (currentRadioStation >= 0 && currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
            return currentRadioStation;
        }
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
            return currentRadioStation;
        }
        return 0;
    }

    public int prevStation() {
        if (currentRadioStation > 0 && currentRadioStation <= 9) {
            currentRadioStation = currentRadioStation - 1;
            return currentRadioStation;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
            return currentRadioStation;
        }
        return 0;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newStation) {
        if (newStation >= 0 && newStation <= 9){
            currentRadioStation = newStation;
        }
        else return;
    }
}
