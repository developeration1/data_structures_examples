package com.example;

import java.util.Scanner;

import com.example.List.List;
import com.example.Stack.Stack;

public abstract class Screen {
    protected List<Contact> contacts;
    protected Stack<Screen> flow;

    public Screen(List<Contact> contacts, Stack<Screen> flow) throws Exception {
        this.contacts = contacts;
        this.flow = flow;
    }

    public void run() throws Exception {

    }

    public void exit() throws Exception {
        flow.pop();
    }

    public String getInput() {
        String input;
        Scanner s = new Scanner(System.in);
        while(true){
            try{
                input = s.nextLine();
                break;
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
        return input;
    }
}
