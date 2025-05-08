package com.pluralsight;


//class
public class Reservation {

    //attributes
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;

   //constructor
    public Reservation(double reservationTotal, boolean isWeekend, int numberOfNights, double price, String roomType) {
        this.reservationTotal = reservationTotal;
        this.isWeekend = isWeekend;
        this.numberOfNights = numberOfNights;
        this.price = price;
        this.roomType = roomType;
    }

    //getters & setters
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = (roomType);
    }

    public double getReservationTotal() {
        return reservationTotal;
    }

    public void setReservationTotal(double reservationTotal) {
        this.reservationTotal = reservationTotal;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


//methods are the equations that you are scared of that make the program calculate stuff
