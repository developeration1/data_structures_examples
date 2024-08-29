package com.example;

public class Contact {
    private long phone1;
    private String name;

    public Contact (long phone, String name){
        phone1 = phone;
        this.name = name;
    }

    public long getPhone(){
        return phone1;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
