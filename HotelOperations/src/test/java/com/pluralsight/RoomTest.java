package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {
    //arrange
    Room room = new Room(1,124.0,false,false,true);


    @org.junit.jupiter.api.Test
    void checkIn() {
        //act
        room.checkIn(room);
        //assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());
    }

    @org.junit.jupiter.api.Test
    void checkOut() {
        //act
        room.checkOut(room);
        //assert
        assertFalse(room.isOccupied());
    }

    @org.junit.jupiter.api.Test
    void cleanRoom() {
        //act
        room.cleanRoom(room);
        //assert
        assertFalse(room.isDirty());
        assertTrue(room.isAvailable());
        assertTrue(room.isAvailable());
    }
}