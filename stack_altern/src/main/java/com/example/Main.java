package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Escribe una operación infija: ");
        String input = s.nextLine();
        String output = "";
        Stack<Character> operators = new Stack<>();

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                output += input.charAt(i);
            }
            if(input.charAt(i) >= '*' && input.charAt(i) <= '/' && input.charAt(i) != '.' && input.charAt(i) != ','){
                operators.push(input.charAt(i));
            }
            if(input.charAt(i) == ')'){
                output += operators.pop();
            }
        }

        while (!operators.isEmpty()) {
            output += operators.pop();
        }

        System.out.println(output);
    }
}