package ru.netology.radio;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;
    public void minVolume() {
        currentVolume = 0;
    }
    public void maxVolume() {
        currentVolume = 10;
    }

    public void increaseVolume() { //увеличивать громкость
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            return;
        }
    }

    public void turnDownTheVolume() { //уменьшить громкость
        if (currentVolume <= 10) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume <= 0) {
            return;
        }
    }
}
