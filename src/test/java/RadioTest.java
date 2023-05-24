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
        radio.setStationNumber(7);
        radio.next();

        int expected = 8;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void nextTest1() {
        radio.setStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void nextTest2() {
        radio.setStationNumber(10000);
        radio.prev();
        radio.next();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void prevTest() {
        radio.setStationNumber(7);
        radio.prev();

        int expected = 6;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void prevTest1() {
        radio.setStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void prevTest2() {
        radio.setStationNumber(10);
        radio.next();
        radio.prev();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setStationNumberTest() {
        radio.setStationNumber(7);

        int expected = 7;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setStationNumberTest1() {
        radio.setStationNumber(-1);


        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setStationNumberTest2() {
        radio.setStationNumber(15);


        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void increaseVolumeTest() {
        radio.setCurrentVolume(90);
        radio.increaseVolume();

        int expected = 91;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void increaseVolumeTest1() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void increaseVolumeTest2() {
        radio.setCurrentVolume(100);
        radio.setCurrentVolume(101);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void decreaseVolumeTest() {
        radio.setCurrentVolume(90);
        radio.decreaseVolume();

        int expected = 89;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void decreaseVolumeTest1() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void decreaseVolumeTest2() {
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
}

    