package mundopc;


import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class Main {
    public static void main(String[] args) {

        // Objeto Computadora Lenovo

        Raton ratonLenovo = new Raton("bluetooth","Lenovo");
        //System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth","Lenovo");
        //System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo",27);
        //System.out.println(monitorLenovo);
        //Creamos un objeto de tipo Computadora

        Computadora computadoraLenovo = new Computadora("Computadora Lenovo",monitorLenovo,tecladoLenovo,ratonLenovo);
        //System.out.println(computadoraLenovo);

        //Objeto computadora Dell

        Monitor monitorDell = new Monitor("Dell",15);
        Teclado tecladoDell = new Teclado("bluetooth","Dell");
        Raton ratonDell = new Raton("bluetooth","Dell");

        Computadora computadoraDell = new Computadora("Computadora Dell",monitorDell,tecladoDell,ratonDell);

        //Creamos una orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();

        System.out.println();

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraDell);
        orden2.agregarComputadora(computadoraLenovo);
        orden2.mostrarOrden();

    }
}