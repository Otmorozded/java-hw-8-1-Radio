package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test

    public void shouldCurrentStation() {
        Radio station = new Radio();
        station.setCurrentStation(5);
        assertEquals(5, station.getCurrentStation());
    }

    @Test
    public void shouldCurrentStationOverMax () {
        Radio station = new Radio();
        station.setCurrentStation(10);
        assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldCurrentStationLessMin () {
        Radio station = new Radio();
        station.setCurrentStation(-1);
        assertEquals(9, station.getCurrentStation());
    }

    @Test

    public void shouldCurrentVolume() {
        Radio volume = new Radio();
        volume.setVolume(5);
        assertEquals(5, volume.getVolume());
    }

    @Test

    public void shouldCurrentVolumeOverMax() {
        Radio volume = new Radio();
        volume.setVolume(11);
        assertEquals(10, volume.getVolume());
    }
    @Test

    public void shouldCurrentVolumeLessMin() {

        Radio volume = new Radio();
        volume.setVolume(-1);
        assertEquals(0, volume.getVolume());
    }


    }






