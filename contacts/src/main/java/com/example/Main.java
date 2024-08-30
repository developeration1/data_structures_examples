package com.example;
import com.example.Stack.Stack;
import com.example.List.List;

public class Main {

    public static Stack<Screen> screens = new Stack<>();
    public static List<Contact> contacts = new List<>();
    public static void main(String[] args) throws Exception {
        screens.push(new ContactListScreen(contacts, screens));
        screens.peek().run();
    }
}