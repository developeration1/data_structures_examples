package com.example.List;

public class List<E> {
    private Node<E> first;

    public List() {
        this.first = null;
    }

    public List(Node<E> first){
        this.first = first;
    }

    public List(E first){
        this.first = new Node<E> (first);
    }

    public E getFirst() {
        if(isEmpty())
            throw new IndexOutOfBoundsException("This list is empty.");
        return first.getData();
    }

    public E getLast(){
        if(isEmpty())
            throw new IndexOutOfBoundsException("This list is empty.");
        return getLastNode(first).getData();
    }

    private Node<E> getLastNode(Node<E> node){
        return node.getNext() == null ? node : getLastNode(node.getNext());
    }

    public void add(E value) {
        if(isEmpty()){
            first = new Node<E>(value);
            return;
        }
        getLastNode(first).setNext(new Node<E>(value));
    }

    public void addAtFirst(E value){
        if(isEmpty()){
            first = new Node<E>(value);
            return;
        }
        Node<E> node = new Node <E>(value);
        node.setNext(first);
        first = node;
    }

    private void insert(int position, E value, Node<E> node){
        if(position >= size() || position < 0)
            throw new IndexOutOfBoundsException("The position requested does not exist.");
        if(position <= 0){
            addAtFirst(value);
            return;
        }
        if(position <= 1) {
            Node <E> newNode = new Node<E>(value);
            newNode.setNext(node.getNext());
            node.setNext(newNode);
            return;
        }

        insert(position - 1, value, node.getNext());
    }

    public void insert(int position, E value) {
        insert(position, value, first);
    }

    private E getValueAt(int position, Node<E> node) {
        if(position >= size() || position < 0){
            throw new IndexOutOfBoundsException("The requested position does not exist.");
        }
        return position <= 0 ? node.getData() : getValueAt(position - 1, node.getNext());
    }

    public E getValueAt(int position){
        return getValueAt(position, first);
    }

    public void deleteFirst(){
        if(isEmpty())
            throw new IndexOutOfBoundsException("This list is empty.");
        first = first.getNext();
    }

    private void deleteLast(Node<E> node){
        if(isEmpty())
            throw new IndexOutOfBoundsException("This list is empty.");

        if(size() == 1){
            deleteFirst();
            return;
        }

        if(node.getNext() != null){
            if(node.getNext().getNext() != null){
                deleteLast(node.getNext());
                return;
            }
        }
        
        node.setNext(null);
    }

    public void deleteLast(){
        deleteLast(first);
    }

    private void deleteAt(int position, Node<E> node) {
        if(position >= size() || position < 0)
            throw new IndexOutOfBoundsException("The requested position does not exist.");

        if(position <= 0){
            deleteFirst();
            return;
        }
        if(position <= 1) {
            node.setNext(node.getNext().getNext());
            return;
        }

        deleteAt(position - 1, node.getNext());
    }

    public void deleteAt(int position){
        deleteAt(position, first);
    }

    public int size() {
        if(first == null){
            return 0;
        }
        Node<E> node = first;
        int n = 1;
        while(node.getNext() != null) {
            node = node.getNext();
            n++;
        }
        return n;
    }

    public boolean isEmpty(){
        return first == null;
    }

    @Override
    public String toString() {
        String listString = new String();
        listString += "[";
        for(int i = 0; i < size(); i++){
            listString += (getValueAt(i).toString() + ", ");
        }
        listString += "]";
        return listString;
    }
}
