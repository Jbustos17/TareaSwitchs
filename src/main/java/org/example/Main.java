package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 3:");
        int opcion = scanner.nextInt();

        String mensaje = switch (opcion) {
            case 1 -> "Has seleccionado la opción 1.";
            case 2 -> "Has seleccionado la opción 2.";
            case 3 -> "Has seleccionado la opción 3.";
            default -> "Opción no válida. Intente de nuevo.";
        };

        System.out.println(mensaje);

        scanner.close();
    }
}
