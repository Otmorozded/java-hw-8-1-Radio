package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int currentStation;
    private int volume;
    private int minStation = 0;
    private int maxStation = 10;
    private int minVolume = 0;
    private int maxVolume = 100;





    /*public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = minStation;
            return;
        }

        if (currentStation < minStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation = currentStation ;



    }

    public void nextStation () {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void previousStation () {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > maxVolume) {
            this.volume = maxVolume;
            return;
        }

        if (volume < minVolume) {
            this.volume = minVolume;
            return;
        }
        this.volume = volume;

    }

    public void volumeUp() {
        if (volume == maxVolume) {
            return;
        }
        volume += 1;
    }

    public void volumeDown() {
        if (volume == minVolume) {
            return;
        }
        volume -= 1;
    }*/


}

    /*public void nextStation () {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void previousStation () {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation--;
    }*/
