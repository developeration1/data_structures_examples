package com.example;

public class Queue<E> {
    public static final int CAPACITY = 1000;

    private E[] data;

    private int size = 0;

    public Queue() {
        this.data = (E[]) new Object[CAPACITY];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(E value){
        data[size] = value;
        size++;
    }

    public E pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty.");
        }
        
        E result = data[0];
        for(int i = 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        return result;
    }

    public E peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty.");
        }

        return data[0];
    }
}
