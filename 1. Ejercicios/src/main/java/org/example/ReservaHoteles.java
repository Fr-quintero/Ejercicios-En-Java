package org.example;

public class ReservaHoteles {
    public static void main(String[] args) {
        System.out.println("*** Sistema de reserva de Hoteles ***");

        //Definimos las variables
        var nombreCliente = "Arturo Rendon";
        var diasEstancia = 7;
        var tarifaDiaria = 1300.00;
        var tieneVistaAlmar = true;

        // Mostrar el detalle de la reserva

        System.out.println("Nombre del cliente : " + nombreCliente);
        System.out.println("Días de estancia : " + diasEstancia);
        System.out.println("Tarifa diaria : " + tarifaDiaria);
        System.out.println("Tiene vista al mar : " + tieneVistaAlmar);
    }
}
