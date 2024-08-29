package com.example;

public class Cook {
    public boolean isCooking;
    private String name;

    public Cook(String name){
        this.name = name;
        isCooking = false;
    }

    public String getName(){
        return name;
    }
}
