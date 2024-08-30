package com.example;

public class PriorityQueue<E> {
    private static final int CAPACITY = 1000;

    private int size = 0;

    private PriorityNode<E>[] data;

    public PriorityQueue() {
        data = new PriorityNode[CAPACITY];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty() {
        return data[1] == null;
    }

    public void push(int priority, E value) {
        PriorityNode node = new PriorityNode<>(priority, value);
        
        size++;

        if(size == 1) {
            data[size] = node;
        } else {
            int pos = size;
            data[pos] = node;
            int parentPos = (int)(pos/2);
            PriorityNode parent = data[parentPos];

            while(pos != 1 && parent.getPriority() > node.getPriority()) {
                data[pos] = parent;
                data[parentPos] = node;
                pos = parentPos;
                parentPos = (int)(parentPos/2);
                parent = data [parentPos];
            }
        }
    }

    public E pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        PriorityNode<E> result = data[1];

        data[1] = data[size];
        data[size] = null;
        size--;

        PriorityNode<E> node = data[1];
        int pos = 1;
        int child1Pos = 2;
        int child2Pos = 3;

        while(size != 1 && (data[child1Pos] != null && data[child2Pos] != null))
        {
            PriorityNode<E> aux = node;
            if(node.getPriority() > data[child1Pos].getPriority()){
                data[pos] = data[child1Pos];
                data[child1Pos] = aux;
                pos = child1Pos;
                child1Pos *= 2;
                child2Pos = child1Pos + 1;
            }
            else if (node.getPriority() > data[child2Pos].getPriority()) {
                data[pos] = data[child2Pos];
                data[child2Pos] = aux;
                pos = child2Pos;
                child1Pos *= 2;
                child2Pos = child1Pos + 1;
            }
            else {
                break;
            }

            //System.out.println(toString());
        }

        return result.getData();
    }

    @Override
    public String toString() {
        String result = "[";
        for(int i = 0; i < size + 1; i++) {
            try {
                result += data[i].getPriority() +", ";
            } catch (Exception e) {
                result += " , ";
            }
        }
        result += "]";
        return result;
    }
}