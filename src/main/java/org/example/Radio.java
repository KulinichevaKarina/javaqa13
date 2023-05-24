package org.example;

public class Radio {
    private int stationNumber;  // номер станции
    private int currentVolume = 0; //увеличение громкость

    public void next() {
        setStationNumber(stationNumber + 1);
    }

    public void prev() {
        setStationNumber(stationNumber - 1);
    }

    public void increaseVolume() {
        this.setCurrentVolume(currentVolume + 1);
    }

    public void decreaseVolume() {
      this.setCurrentVolume(currentVolume - 1);
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber < 0) {
            stationNumber = 9;
        }
        if (stationNumber > 9) {
            stationNumber = 0;
        }
        this.stationNumber = stationNumber;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }
}


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