package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            /*int firstNum = scanner.nextInt();
            System.out.println(firstNum);*/
            System.out.println(scanner.nextInt()+scanner.nextInt());
        } catch (Exception e) {
            System.out.println("Falsche Eingabe");
        }
    }
}