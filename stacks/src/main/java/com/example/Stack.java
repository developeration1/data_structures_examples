package com.example;

public class Stack<E> {
    public static final int CAPACITY = 1000;
    private E[] data;
    private int size = 0;

    public Stack(){
        data = (E[]) new Object[CAPACITY];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void push(E value){
        data[size()] = value;
        size++;
    }

    public E pop() throws Exception {
        E result = null;
        if(isEmpty()){
            throw new Exception("The Stack is empty.");
        }
        size--;
        result = data[size()];
        data[size()] = null;
        return result;
    }

    public E peek() throws Exception {
        E result = null;
        if(isEmpty()){
            throw new Exception("The Stack is empty.");
        }
        result = data[size() - 1];
        return result;
    }
}
