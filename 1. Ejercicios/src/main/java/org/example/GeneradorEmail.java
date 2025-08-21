package org.example;

public class GeneradorEmail {
    public static void main(String[] args) {
        System.out.println("*** Generador de Email ***");

        var nombreCompleto = " Luis Francisco Quintero Aviña ";
        System.out.println("Nombre Completo: " + nombreCompleto);
        //Procesar o normalizar el nombre del usuario
        //Limpiar los espacios en blanco al inicio y al final
        var nombreNormalizado = nombreCompleto.strip();
        //Reemplazar los espacios en blanco por punto
        nombreNormalizado = nombreNormalizado.replace(" ", ".");
        //Convertimos a minúsculas
        nombreNormalizado = nombreNormalizado.toLowerCase();
        System.out.println("nombreNormalizado: " + nombreNormalizado);

        //Datos de la empresa
        var nombreEmpresa = " AjoloCode ";
        System.out.println("\nNombre empresa: " + nombreEmpresa);
        var extensionDominio = ".com.mx";
        System.out.println("Extensión del dominio: "+ extensionDominio);

        //Quitamos los espacios en blanco y convertimos a minúsculas
        var nombreEmpresaNormalizado = nombreEmpresa.strip().replace(" ", ".").toLowerCase();
        var dominioNormalizado = "@"+ nombreEmpresaNormalizado + extensionDominio;
        System.out.println("Dominio de empresa Normalizado: " + dominioNormalizado);

        // Creamos el email final

        var emailNormalizado = nombreNormalizado + dominioNormalizado;
        System.out.println("Email Normalizado :" + emailNormalizado);

    }
}
