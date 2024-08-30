package com.example;

import com.example.List.List;
import com.example.Stack.Stack;

public class ContactListScreen extends Screen {

    public ContactListScreen(List<Contact> contacts, Stack<Screen> flow) throws Exception {
        super(contacts, flow);
    }

    @Override
    public void run() throws Exception {
        boolean turnOff = false;
        while (!turnOff) {
            System.out.println("Lista de Contactos");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println(i + " - " + contacts.getValueAt(i).firstName +
                        " " + contacts.getValueAt(i).lastName);
            }
            System.out.println("a - Ver contacto");
            System.out.println("b - Crear contacto");

            while (true) {
                String input = getInput();
                boolean exit = false;
                switch (input) {
                    case "a":
                        exit = true;
                        break;
                    case "b":
                        flow.push(new AddContactScreen(contacts, flow));
                        flow.peek().run();
                        exit = true;
                        break;
                    default:
                        System.out.println(input + " no es una opción");
                        break;
                }
                if (exit)
                    break;
            }
        }
        super.run();
        super.exit();
    }
}
