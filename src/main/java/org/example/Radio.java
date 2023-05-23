package org.example;

public class Radio {
    public int stationNumber;  // номер станции
    public int currentVolume = 0; //увеличение громкость
    private int stationCount;
    private int defaultStationCount = 10;

    public Radio () {
        this.stationCount = defaultStationCount;
    }
    public Radio(int inputStationCount) {
        if (inputStationCount > 0) {
            this.stationCount = inputStationCount;
        } else {
            this.stationCount = defaultStationCount;
        }
    }

    public void next() {

        if (stationNumber <= this.stationCount - 1) {
            stationNumber++;
        }
        if (stationNumber > this.stationCount - 1) {
            stationNumber = 0;
        }
    }

    public void prev() {
        if (stationNumber <= this.stationCount - 1) {
            --stationNumber;
        }
        if (stationNumber > this.stationCount - 1) {
            stationNumber = 0;
        }
        if (stationNumber < 0) {
            stationNumber = this.stationCount - 1;
        }
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber < 0) {
            return;
        }
        if (stationNumber > this.stationCount - 1) {
            return;
        }
        this.stationNumber = stationNumber;
    }

    public int getStationCount() {
        return this.stationCount;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
    }
}

