package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        //Empezamos con el menu

        var salir = false;

        while (!salir) {
            mostrarMenu();
            try {
                salir = ejecutarOperacion(sc, personas);
            } catch (Exception e) {
                System.out.println("Oucurrio un error: " + e.getMessage());
            }

            System.out.println();

        }
    }

    private static void mostrarMenu() {
        System.out.print("""
                **** Listado Personas App**
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Proporciona la opcion?");
    }

    private static boolean ejecutarOperacion(Scanner sc, List<Persona> personas) {
        var opcion = Integer.parseInt(sc.nextLine());
        var salir = false;
        //Revisamos la opcion proporcionada

        switch (opcion) {
            case 1 -> {// Agregar persona a la lista
                System.out.print("Proporciona el nombre: ");
                var nombre = sc.nextLine();
                System.out.print("Proporciona el telefono: ");
                var tel = sc.nextLine();
                System.out.print("Proporciona el email: ");
                var email = sc.nextLine();

                //Crear el objeto Persona
                var persona = new Persona(nombre, tel, email);

                //Lo agregamos a la lista

                personas.add(persona);

                System.out.println("La lista tiene: " + personas.size() + " elementos");
            }// fin caso 1
            case 2 -> {// Listar las personas
                System.out.println("Listado de Personas: ");
                //Mejora usando lambda y metodo de referencia
                //personas.forEach((persona) -> System.out.println(persona));
                personas.forEach(System.out::println);
            }
            case 3 -> {// Salimos de ciclo
                System.out.println("Hasta pronto...");
                salir = true;
            }
            default -> System.out.println("Opcion erronea: " + opcion);
        }//Fin switch
        return salir;
    }
}
