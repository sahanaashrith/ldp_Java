
//----------------------INTERFACE SEGREGATION PRINCIPLE violation---------------------//
//clients should not be forced to deal with the methods that they don’t use.
package com.solid.interfaceseg.violation;

interface Booking {
     void bookCourt();
     void bookTime(int t);
     void bookTable();
}

class Guest implements Booking {
    public void bookCourt(){
        System.out.println("the court is booked");
    }
    public void bookTime(int time) {
        System.out.println("The court is booked at time : "+time + "o'clock");
    }
    public void bookTable() {
        System.out.println("table is booked for guest");
    }
}