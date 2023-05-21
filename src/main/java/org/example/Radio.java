package org.example;

public class Radio {
    public int stationNumber;  // номер станции
    public int currentVolume = 0; //увеличение громкость
//    public int decreaseVolume; //уменьшение громкости



    public void next() {
        if (stationNumber <= 9) {
            stationNumber++;
        }
        if (stationNumber > 9) {
            stationNumber = 0;
        }
    }

    public void prev() {
        if (stationNumber <= 9) {
            --stationNumber;
        }
        if (stationNumber > 9) {
            stationNumber = 0;
        }
        if (stationNumber < 0) {
            stationNumber = 9;
        }
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber < 0) {
            return;
        }
        if (stationNumber > 9) {
            return;
        }
        this.stationNumber = stationNumber;
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
















//    public int getStationNumber() {
//        return stationNumber;
//    }
//
//    public void setStationNumber(int newStationNumber) {
////        this.stationNumber = stationNumber;
//        if (newStationNumber < 0) {
//            return;
//        }
//        if (newStationNumber > 10) {
//            return;
//        }
//        stationNumber = newStationNumber;
//    }