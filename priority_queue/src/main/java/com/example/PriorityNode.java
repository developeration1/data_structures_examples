package com.example;

public class PriorityNode<E> {
    private int priority;
    private E data;

    public PriorityNode(){

    }

    public PriorityNode(int priority, E data) {
        this.priority = priority;
        this.data = data;
    }

    public int getPriority(){
        return priority;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }

    public E getData(){
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
