package com.pluralsight;

public class Reservation {
    private String RoomType;
    private int NumberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        RoomType = roomType;
        NumberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }
    public double getRoomPrice(){
        double roomPrice = 0.0;
        if (getRoomType().equalsIgnoreCase("King")) {
                    roomPrice = 139.0;
        } else if (getRoomType().equalsIgnoreCase("Double")){
            roomPrice = 124.0;
        } else if (getRoomType().equalsIgnoreCase("King") && isWeekend) {
            roomPrice = (139.0 * 0.1) + 139.0;
        } else if (getRoomType().equalsIgnoreCase("Double") && isWeekend) {
            roomPrice = (124.0 * 0.1) + 124.0;
        }
        return roomPrice;
    }


    public int getNumberOfNights() {
        return NumberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        NumberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getResTotal() {
        return getRoomPrice() * NumberOfNights;
    }
}

