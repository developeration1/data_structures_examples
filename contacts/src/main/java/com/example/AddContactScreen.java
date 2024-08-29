package com.example;

import com.example.List.List;
import com.example.Stack.Stack;

public class AddContactScreen extends Screen{

    public AddContactScreen(List<Contact> contacts, Stack<Screen> flow) throws Exception{
        super(contacts, flow);
    }

    @Override
    public void run() throws Exception {
        System.out.print("Nombre: ");
        String firstName = getInput();
        System.out.print("Apellido: ");
        String lastName = getInput();
        System.out.print("Número: ");
        String phone = getInput();
        System.out.print("Email: ");
        String email = getInput();
        Contact newContact;
        if(email == "" || email == null)
            newContact = new Contact(firstName, lastName, phone);
        else
            newContact = new Contact(firstName, lastName, phone, email);
        contacts.add(newContact);
        super.run();
        super.exit();
    }
}
