package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Add \n2: Sub");

        int num1;
        int num2;
        int chosenOperator = scanner.nextInt();

        switch(chosenOperator) {
            case 1:
                System.out.println("hallo 1");
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println("hallo 2");
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                System.out.println(num1 - num2);
                break;
            default:
                System.out.println("hallo default");
        }
        /*
        try {
            System.out.println(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Falsche Eingabe");
        }*/
        scanner.close();
    }


}