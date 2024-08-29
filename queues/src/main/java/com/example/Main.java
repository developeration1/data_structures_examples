package com.example;

public class Main {
    public static void main(String[] args) throws Exception {
        Queue<Order> orders = new Queue<>();

        Cook[] cooks = {new Cook("Pablo"), new Cook("Beto"), new Cook("Mariano")}; 

        orders.push(new Order(5));
        orders.push(new Order(10));
        orders.push(new Order(4));
        orders.push(new Order(7));
        orders.push(new Order(1));
        orders.push(new Order(9));
        orders.push(new Order(2));
        orders.push(new Order(3));
        orders.push(new Order(8));
        orders.push(new Order(5));

        while (true) {
            Thread.sleep(100);
            if(orders.isEmpty())
                break;
            
            for(int i = 0; i < cooks.length; i++) {
                if(cooks[i].isCooking == false){
                    Order actual = orders.pop();
                    actual.setAssignedCook(cooks[i]);
                    Thread cooking = new Thread(actual);
                    cooking.start();
                }
            }
        }

        System.out.println("Finished cooking!");
    }
}