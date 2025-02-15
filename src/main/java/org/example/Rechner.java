package org.example;

import java.util.Scanner;

public class Rechner {
    private final Scanner scanner;

    public Rechner() {
        scanner = new Scanner(System.in);
    }

    public void choseOperation() {
        System.out.println("Wähle eine Operation aus:\n1: Add \n2: Sub\n3: Multi\n4: Divide");
        int chosenOperator = scanner.nextInt();
        switch (chosenOperator) {
            case 1:
                System.out.println("Add");
                rechner(chosenOperator);
                break;
            case 2:
                System.out.println("Sub");
                rechner(chosenOperator);
                break;
            case 3:
                System.out.println("Multi");
                rechner(chosenOperator);
                break;
            case 4:
                System.out.println("Divide");
                rechner(chosenOperator);
                break;
            default:
                System.out.println("Falsche Eingabe");
                break;
        }
        newOperation();
    }

    public void rechner(int operator) {
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        switch (operator) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Falsche Eingabe");
        }
    }

    public void newOperation() {
        System.out.println("Noch eine Rechnung? Ja oder Nein");
        String anotherOperation;
        try (Scanner scanner1 = new Scanner(System.in)) {
            anotherOperation = scanner1.nextLine();
        }
        switch (anotherOperation) {
            case "Ja":
                choseOperation();
                break;
            case "Nein":
                System.out.println("Tschüss");
                break;
            default:
                System.out.println("Falsche Eingabe");
                newOperation();
                break;
        }
    }
}
