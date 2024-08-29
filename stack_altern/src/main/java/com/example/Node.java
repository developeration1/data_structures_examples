package com.example;

public class Node<E> {
    private E data;

    private Node<E> bottom;

    public Node(E data, Node<E> bottom) {
        this.data = data;
        this.bottom = bottom;
    }

    public Node(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public Node<E> getBottom() {
        return bottom;
    }

    public void setData(E data) {
        this.data = data;
    }

    public void setBottom(Node<E> node) {
        this.bottom = node;
    }
}
