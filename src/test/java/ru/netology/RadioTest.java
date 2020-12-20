package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {



    @Test

    public void shouldCurrentStationUp() {
        Radio station = new Radio();
        station.setCurrentStation(5);
        station.nextStation();
        assertEquals(6, station.getCurrentStation());
    }
    @Test

    public void shouldCurrentStationDown() {
        Radio station = new Radio();
        station.setCurrentStation(4);
        station.previousStation();
        assertEquals(3, station.getCurrentStation());
    }


    @Test
    public void shouldCurrentStationOverMaxUp () {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.nextStation();
        assertEquals(0, station.getCurrentStation());
    }

    @Test

    public void shouldCurrentStationOverMax () {
        Radio station = new Radio();
        station.setCurrentStation(10);
        assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldCurrentStationLessMinDown () {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.previousStation();
        assertEquals(9, station.getCurrentStation());
    }

    @Test
    public void shouldCurrentStationLessMin () {
        Radio station = new Radio();
        station.setCurrentStation(-1);
        assertEquals(9, station.getCurrentStation());
    }

    @Test

    public void shouldCurrentVolumeUp() {
        Radio volume = new Radio();
        volume.setVolume(5);
        volume.volumeUp();
        assertEquals(6, volume.getVolume());
    }

    @Test
    public void shouldCurrentVolumeDown() {
        Radio volume = new Radio();
        volume.setVolume(5);
        volume.volumeDown();
        assertEquals(4, volume.getVolume());
    }




    @Test

    public void shouldCurrentVolumeOverMaxUp() {
        Radio volume = new Radio();
        volume.setVolume(10);
        volume.volumeUp();
        assertEquals(10, volume.getVolume());
    }

    @Test

    public void shouldCurrentVolumeOverMax() {
        Radio volume = new Radio();
        volume.setVolume(11);

        assertEquals(10, volume.getVolume());
    }
    @Test

    public void shouldCurrentVolumeLessMinDown() {

        Radio volume = new Radio();
        volume.setVolume(0);
        volume.volumeDown();
        assertEquals(0, volume.getVolume());
    }
    @Test

    public void shouldCurrentVolumeLessMin() {

        Radio volume = new Radio();
        volume.setVolume(-1);

        assertEquals(0, volume.getVolume());
    }


    }









