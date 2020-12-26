package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {



    @Test

    public void shouldCurrentStationUp() {
        Radio station = new Radio(10);
        station.setCurrentStation(5);
        station.nextStation();
        assertEquals(6, station.getCurrentStation());
    }
    @Test

    public void shouldCurrentStationCountLessTen() {
        Radio station = new Radio(5) ;
        station.setCurrentStation(3);
        station.nextStation();
        assertEquals(4, station.getCurrentStation());

    }

    @Test

    public void ShouldCurrentStationCountOverTen() {
        Radio station = new Radio(15);
        station.setCurrentStation(13);
        station.nextStation();
        assertEquals(14, station.getCurrentStation());

    }



    @Test

    public void shouldCurrentStationDown() {
        Radio station = new Radio(6);
        station.setCurrentStation(4);
        station.previousStation();
        assertEquals(3, station.getCurrentStation());
    }


    @Test
    public void shouldCurrentStationOverMaxUp () {
        Radio station = new Radio(3);
        station.setCurrentStation(3);
        station.nextStation();
        assertEquals(0, station.getCurrentStation());
    }

    @Test

    public void shouldCurrentStationOverMax () {
        Radio station = new Radio(10);
        station.setCurrentStation(11);
        assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldCurrentStationLessMinDown () {
        Radio station = new Radio(12);
        station.setCurrentStation(0);
        station.previousStation();
        assertEquals(12, station.getCurrentStation());
    }

    @Test
    public void shouldCurrentStationLessMin () {
        Radio station = new Radio(10);
        station.setCurrentStation(-1);
        assertEquals(10, station.getCurrentStation());
    }

    @Test

    public void shouldCurrentVolumeUp() {
        Radio volume = new Radio(10);
        volume.setVolume(5);
        volume.volumeUp();
        assertEquals(6, volume.getVolume());
    }

    @Test
    public void shouldCurrentVolumeDown() {
        Radio volume = new Radio(10);
        volume.setVolume(5);
        volume.volumeDown();
        assertEquals(4, volume.getVolume());
    }




    @Test

    public void shouldCurrentVolumeOverMaxUp() {
        Radio volume = new Radio(10);
        volume.setVolume(100);
        volume.volumeUp();
        assertEquals(100, volume.getVolume());
    }

    @Test

    public void shouldCurrentVolumeOverMax() {
        Radio volume = new Radio(10);
        volume.setVolume(101);

        assertEquals(100, volume.getVolume());
    }
    @Test

    public void shouldCurrentVolumeLessMinDown() {

        Radio volume = new Radio(10);
        volume.setVolume(0);
        volume.volumeDown();
        assertEquals(0, volume.getVolume());
    }
    @Test

    public void shouldCurrentVolumeLessMin() {

        Radio volume = new Radio(10);
        volume.setVolume(-1);

        assertEquals(0, volume.getVolume());
    }




    }









