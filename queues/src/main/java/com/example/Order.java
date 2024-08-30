package com.example;

public class Order implements Runnable {
    private int time;
    private Cook assignedCook;
    
    public Order(int time){
        this.time = time;
    }

    public void setAssignedCook(Cook cook){
        assignedCook = cook;
    }

    @Override
    public void run() {
        assignedCook.isCooking = true;
        System.out.println("The cook " + assignedCook.getName() + ", STARTED doing the next dish");
        for(int i = 0; i < time; i++) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("The cook " + assignedCook.getName() + " ENDED doing a dish");
        assignedCook.isCooking = false;
    }
}
