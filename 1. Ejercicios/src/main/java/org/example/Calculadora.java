package org.example;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();

            mostrarMenu();

            try {
                var operacion = Integer.parseInt(sc.nextLine());

                if (operacion >= 1 && operacion <= 4) {

                    ejecutarOperacion(operacion, sc);

                } else if (operacion == 5) {
                    System.out.println();
                    System.out.println("Hasta pronto...");
                    System.out.println();
                    break;

                } else {
                    System.out.println();
                    System.out.println("Opcion: -> " + operacion + " <- es erronea, escoge una correcta [1,2,3,4,5]");
                }

            } catch (Exception e) {
                System.out.println();
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }

    }

    private static void mostrarMenu() {
        System.out.println("*** Aplicacion Calculadora ***");

        //Mostrar el menu
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. Division
                5. Salir
                """);

        System.out.print("Operacion a realizar ?: ");
    }

    private static void ejecutarOperacion(int operacion, Scanner sc) {

        System.out.print("Proporciona el valor del primer operador: ");
        var operador1 = Double.parseDouble(sc.nextLine());

        System.out.print("Proporciona el valor del segundo operador: ");
        var operador2 = Double.parseDouble(sc.nextLine());

        double resultado;

        switch (operacion) {
            case 1 -> {
                resultado = operador1 + operador2;
                System.out.println("Resultado de la Suma: " + resultado);
            }
            case 2 -> {
                resultado = operador1 - operador2;
                System.out.println("Resultado de la Resta: " + resultado);
            }
            case 3 -> {
                resultado = operador1 * operador2;
                System.out.println("Resultado de la Multiplicacion: " + resultado);
            }
            case 4 -> {
                resultado = operador1 / operador2;
                System.out.println("Resultado de la Division: " + resultado);
            }
            default -> System.out.println("Opcion erronea: " + operacion);
        }

    }

}
