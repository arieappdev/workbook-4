package com.pluralsight;

import java.sql.Struct;

public class Room {
    private int numberOfBeds = 0;
    private double price = 0;
    private boolean isOccupied = false;
    private boolean isDirty = false;
    private String checkIn;
    private String checkOut;
    private String cleanRoom;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty, String checkIn, String checkOut, String cleanRoom) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.cleanRoom = cleanRoom;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }
    public double getPrice() {
        return price;
    }
    public boolean isOccupied() {
        return isOccupied;
    }
    public boolean isDirty() {
        return isDirty;
    }
    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    public String getCheckOut() {
        return checkOut;
    }
    public String getCleanRoom() {
        return cleanRoom;
    }

    public void checkIn() {
        this.isOccupied = true;
        this. isDirty = true;
    }

    public void checkOut() {
        this.isOccupied =false;
        cleanRoom();
    }

    public void cleanRoom() {
        isDirty = false;
    }
}

