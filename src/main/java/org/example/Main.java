package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 3:");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado la opción 1.");
                break;
            case 2:
                System.out.println("Has seleccionado la opción 2.");
                break;
            case 3:
                System.out.println("Has seleccionado la opción 3.");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
                break;
        }

        scanner.close();

        }
    }
