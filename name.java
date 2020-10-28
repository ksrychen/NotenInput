package com;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operator, durch1, durch2, durch3, durch4;
        durch1 = 2;
        durch2 = 3;
        durch3 = 4;
        durch4 = 5;
        operator = 0;

        while (operator <= 5) {
            System.out.println("[1] zwei Noten Durchschnitt");
            System.out.println("[2] drei Noten Durchschnitt");
            System.out.println("[3] vier Noten Durchschnitt");
            System.out.println("[4] fünf Noten Durchschnitt");
            System.out.println("[5] Ende");
            System.out.println("Wählen Sie von wie vielen Noten sie den Durchschnitt haben möchten");
            operator = sc.nextInt();
            if (operator == 4) {
                System.out.println("1. Zahl :");
                double value1 = sc.nextDouble();
                System.out.println("2. Zahl :");
                double value2 = sc.nextDouble();
                System.out.println("3. Zahl :");
                double value3 = sc.nextDouble();
                System.out.println("4. Zahl :");
                double value4 = sc.nextDouble();
                System.out.println("5. Zahl :");
                double value5 = sc.nextDouble();
                String ergebnis = "";
                switch (operator) {
                    case 4:ergebnis = String.valueOf((value1 + value2 + value3 + value4 + value5) / durch4);
                        break;
                    default:break;
                }
                System.out.println("Ergebnis :" + ergebnis);
            } else if (operator == 2) {
                System.out.println("1. Zahl :");
                double value1 = sc.nextDouble();
                System.out.println("2. Zahl :");
                double value2 = sc.nextDouble();
                System.out.println("3. Zahl :");
                double value3 = sc.nextDouble();
                String ergebnis = "";
                switch (operator) {
                    case 2:
                        ergebnis = String.valueOf((value1 + value2 + value3) / durch2);
                        break;
                    default:
                        break;
                }
                System.out.println("Ergebnis :" + ergebnis);
            } else if (operator == 1) {
                System.out.println("1. Zahl :");
                double value1 = sc.nextDouble();
                System.out.println("2. Zahl :");
                double value2 = sc.nextDouble();
                String ergebnis = "";
                switch (operator) {
                    case 1: ergebnis = String.valueOf((value1 + value2) / durch1);
                        break;
                    default:
                        break;
                }
                System.out.println("Ergebnis :" + ergebnis);
            } else if (operator == 3) {
                System.out.println("1. Zahl :");
                double value1 = sc.nextDouble();
                System.out.println("2. Zahl :");
                double value2 = sc.nextDouble();
                System.out.println("3. Zahl :");
                double value3 = sc.nextDouble();
                System.out.println("4. Zahl :");
                double value4 = sc.nextDouble();;
                String ergebnis = "";
                switch (operator) {
                    case 3: ergebnis = String.valueOf((value1 + value2 + value3 + value4) / durch3);
                            break;
                        default:break;
                }
                System.out.println("Ergebnis :" + ergebnis);
            }
        }
    }
}
