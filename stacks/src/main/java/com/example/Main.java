package com.example;

public class Main {
    public static void main(String[] args) {
        Stack<String> nombres = new Stack<>();
        nombres.push("Paco");
        nombres.push("Gael");
        nombres.push("Román");

        try{
            System.out.println(nombres.peek());
            System.out.println(nombres.pop());
            System.out.println(nombres.peek());
        } catch(Exception e){
            System.out.println(e);
        }
        
    }
}