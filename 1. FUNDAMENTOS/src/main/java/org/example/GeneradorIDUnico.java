package org.example;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    public static void main(String[] args) {

        System.out.println("*** Sistema Generador de ID único ***");
        var consola = new Scanner(System.in);
        var aleatorio =  new Random();

        //Solicitamos nombre de Usuario
        System.out.println("Cual es tu nombre? ");
        var nombre = consola.nextLine();

        //Solicitamos el apellido
        System.out.println("Cual es tu apellido?");
        var apellido = consola.nextLine();

        //Solicitamos el año de nacimiento
        System.out.println("Cual es tu año de nacimiento? (YYYY)");
        var anioNacimiento = consola.nextLine();

        //Normalizar los valores
        var nombre2 = nombre.trim().toUpperCase().substring(0,2);
        var apellido2 = apellido.trim().toUpperCase().substring(0,2);
        var anioNacimiento2 = anioNacimiento.trim().substring(2);

        // Generar el valor aleatorio
        var numeroAleatorio = aleatorio.nextInt(9999) + 1;

        //FOrmato de 4 digitos

        var numeroAleatorioFormato = String.format("%04d", numeroAleatorio);

        //Generar el ID único

        var idUnico = nombre2 + apellido2 + anioNacimiento2 + numeroAleatorioFormato;

        //Imprimir el ID unico

        System.out.printf("""
                %nHola %s,
                \tTu número de identificación (ID) generado por el sistema es:
                \t%s
                \t"Felicidades!!"
                """, nombre, idUnico);

    }
}