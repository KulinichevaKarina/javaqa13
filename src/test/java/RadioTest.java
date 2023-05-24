import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void nextTest() {
        Radio radio = new Radio();
        radio.setStationNumber(7);
        radio.next();

        int expected = 8;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void nextTest1() {
        Radio radio = new Radio();
        radio.setStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void nextTest2() {
        Radio radio = new Radio();
        radio.setStationNumber(10000);
        radio.prev();
        radio.next();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void prevTest() {
        Radio radio = new Radio();
        radio.setStationNumber(7);
        radio.prev();

        int expected = 6;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void prevTest1() {
        Radio radio = new Radio();
        radio.setStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void prevTest2() {
        Radio radio = new Radio();
        radio.setStationNumber(10);
        radio.next();
        radio.prev();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setStationNumberTest() {
        Radio radio = new Radio();
        radio.setStationNumber(7);

        int expected = 7;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setStationNumberTest1() {
        Radio radio = new Radio();
        radio.setStationNumber(-1);


        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setStationNumberTest2() {
        Radio radio = new Radio();
        radio.setStationNumber(15);


        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(90);
        radio.increaseVolume();

        int expected = 91;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void increaseVolumeTest1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void increaseVolumeTest2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setCurrentVolume(101);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void decreaseVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(90);
        radio.decreaseVolume();

        int expected = 89;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void decreaseVolumeTest1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void decreaseVolumeTest2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
}

    