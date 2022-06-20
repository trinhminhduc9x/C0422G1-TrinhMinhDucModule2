package Ss11_Dsa_Stack_Queue.exercise.model;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap bieu thuc kiem tra ");
        String strings = scanner.nextLine();
        for (int i = 0; i < strings.length(); i++) {
            stringStack.push(strings.charAt(i)+"");
        }
        while (!stringStack.isEmpty()){
            System.out.print(stringStack.pop());
        }
    }
}
