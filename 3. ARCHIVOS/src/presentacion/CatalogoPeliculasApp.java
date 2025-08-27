package presentacion;

import dominio.Pelicula;
import servicio.IServicioPeliculas;
import servicio.ServicioPeliculasArchivo;
import servicio.ServicioPeliculasLista;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class CatalogoPeliculasApp {
    public static void main(String[] args) {

        var salir = false;
        var sc = new Scanner(System.in);
        // Agregamos la implementacion del servicio
        //IServicioPeliculas servicioPeliculas = new ServicioPeliculasLista();
        IServicioPeliculas servicioPeliculas = new ServicioPeliculasArchivo();
        while (!salir){
            try {
                mostrarMenu();
                salir = ejecuarOpciones(sc, servicioPeliculas);
            }catch (Exception e){
                System.out.println("Ocurrio un error: "+e.getMessage());
            }
            System.out.println();
        }// fin de while

    }

    private static void mostrarMenu(){
        System.out.print("""
                *** Catalogo de Peliculas ***
                1. Agregar Pelicula
                2. Listar Peliculas
                3. Buscar Pelicula
                4. Salir
                Elige una opcion:
                """);
    }

    private static boolean ejecuarOpciones(Scanner sc, IServicioPeliculas servicioPeliculas){
        var opcion = Integer.parseInt(sc.nextLine());
        var salir = false;

        switch (opcion){
            case 1 -> {
                System.out.println("Introduce el nombre de la pelicula: ");
                var nombrePelicula = sc.nextLine();
                servicioPeliculas.agregarPelicula(new Pelicula(nombrePelicula));
            }
            case 2 -> servicioPeliculas.listarPeliculas();
            case 3 -> {
                System.out.println("Introduce la pelicula a buscar: ");
                var buscar = sc.nextLine();
                servicioPeliculas.buscarPelicula(new Pelicula(buscar));
            }
            case 4 -> {
                System.out.println("Hasta pronto !!");
                salir = true;
            }
            default -> System.out.println("Opcion no reconocida: " +opcion);
        }

        return salir;

    }
}