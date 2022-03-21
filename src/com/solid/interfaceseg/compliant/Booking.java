
//----------------------INTERFACE SEGREGATION PRINCIPLE---------------------//
//clients should not be forced to deal with the methods that they don’t use.
package com.solid.interfaceseg.compliant;

public interface Booking {
    public void bookCourt();
    public void bookTime(int t);
}

interface GuestBooking{
    public void bookTable();
}

class MemberBooking implements Booking{
    public void bookCourt(){
        System.out.println("the court is booked");
    }

    public void bookTime(int time) {
        System.out.println("The court is booked at time : "+time + "o'clock");
    }
}

class Guest implements GuestBooking{

    public void bookTable() {
        System.out.println("table is booked for guest");
    }
}
