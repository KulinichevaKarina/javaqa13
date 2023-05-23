import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void inputStationCountTest() {
        Radio radio = new Radio(15);

      Assertions.assertEquals(15, radio.getStationCount());
    }

    @Test
    public void inputStationCountZeroTest() {
        Radio radio = new Radio(0);

        Assertions.assertEquals(10, radio.getStationCount());
    }

    @Test
    public void nextTest() {
//        Radio radio = new Radio();
        radio.stationNumber = 7;
        radio.next();

        int expected = 8;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void nextTest1() {
//        Radio radio = new Radio();
        radio.stationNumber = 9;
        radio.next();

        int expected = 0;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void nextTest2() {
//        Radio radio = new Radio();
        radio.stationNumber = 10;
        radio.next();

        int expected = 0;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void prevTest() {
//        Radio radio = new Radio();
        radio.stationNumber = 7;
        radio.prev();

        int expected = 6;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void prevTest1() {
//        Radio radio = new Radio();
        radio.stationNumber = 0;
        radio.prev();

        int expected = 9;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void prevTest2() {
//        Radio radio = new Radio();
        radio.stationNumber = 10;
        radio.prev();

        int expected = 0;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setStationNumberTest() {
//        Radio radio = new Radio();
        radio.setStationNumber(7);

        int expected = 7;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setStationNumberTest1() {
//        Radio radio = new Radio();
        radio.setStationNumber(-1);


        int expected = 0;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setStationNumberTest2() {
//        Radio radio = new Radio();
        radio.setStationNumber(15);


        int expected = 0;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void increaseVolumeTest() {
//        Radio radio = new Radio();
        radio.currentVolume = 90;
        radio.increaseVolume();

        int expected = 91;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void increaseVolumeTest1() {
//        Radio radio = new Radio();
        radio.currentVolume = 100;
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void increaseVolumeTest2() {
//        Radio radio = new Radio();
        radio.currentVolume = 101;
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void decreaseVolumeTest() {
//        Radio radio = new Radio();
        radio.currentVolume = 90;
        radio.decreaseVolume();

        int expected = 89;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void decreaseVolumeTest1() {
//        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void decreaseVolumeTest2() {
//        Radio radio = new Radio();
        radio.currentVolume = -1;
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected,actual);
    }
}

    