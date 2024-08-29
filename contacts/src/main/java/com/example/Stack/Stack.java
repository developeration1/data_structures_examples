package com.example.Stack;

public class Stack<E> {
    private Node<E> last;

    public int size = 0;

    public Stack(){
        last = null;
    }

    public Stack(E value){
        last = new Node<E>(value);
        size++;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void push(E value){
        if(isEmpty()){
            last = new Node<E>(value);
        }
        else {
            Node<E> node = new Node<E>(value);
            node.setBottom(last);
            last = node;
        }
        size++;
    }

    public E pop() throws Exception{
        if (isEmpty()) {
            throw new Exception("This stack is empty.");
        }
        size--;
        Node<E> aux = last;
        last = last.getBottom();
        return aux.getData();
    }

    public E peek() throws Exception{
        if (isEmpty()) {
            throw new Exception("This stack is empty.");
        }
        return last.getData();
    }
}
