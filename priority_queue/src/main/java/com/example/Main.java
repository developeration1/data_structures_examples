package com.example;

public class Main {
    public static void main(String[] args) throws Exception {
        PriorityQueue<String> queue = new PriorityQueue<>();

        queue.push(5, "null");
        System.out.println(queue);
        queue.push(8, "null");
        System.out.println(queue);
        queue.push(6, "null");
        System.out.println(queue);
        queue.push(2, "null");
        System.out.println(queue);
        queue.push(6, "null");
        System.out.println(queue);
        queue.push(3, "null");
        System.out.println(queue);
        queue.push(5, "null");
        System.out.println(queue);
        queue.push(2, "null");
        System.out.println(queue);

        System.out.println(queue.pop());
        System.out.println(queue);
        System.out.println(queue.pop());
        System.out.println(queue);
        System.out.println(queue.pop());
        System.out.println(queue);
        System.out.println(queue.pop());
        System.out.println(queue);
    }
}