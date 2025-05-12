package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }
    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if (isSuite){
            if (bookedSuites >= numberOfSuites){
                return false;
            }
            else return true;
        }
        else {
            if (bookedBasicRooms >= numberOfRooms){
                return false;
            }
            else return true;
        }
    }
    public int getAvailableSuites(Hotel hotel){
        int availableSuites = numberOfSuites - bookedSuites;
        System.out.println("There are " + availableSuites + " available suites.");
        return availableSuites;
    }
    public int getAvailableRooms(Hotel hotel){
        int availableBasicRooms = numberOfRooms - bookedBasicRooms;
        int totalAvailble = getAvailableSuites(hotel) + availableBasicRooms;
        System.out.println("There are " + totalAvailble + " available rooms.");
        return totalAvailble;
    }
}
