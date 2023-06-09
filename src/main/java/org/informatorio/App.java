package org.informatorio;

import org.informatorio.dominio.Entrenador;
import org.informatorio.dominio.Equipo;
import org.informatorio.dominio.Jugador;


import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;
import java.time.Period;



public class App 
{
    private static Scanner scanner = new Scanner(System.in);

    public static Scanner getScanner() {
        return scanner;
    }

    public static void main( String[] args )
    {
        System.out.println("Fut5App Menu");

        int opcion = 0;

        do {
            System.out.println("1) Crear un equipo");
            System.out.println("2) Buscar jugador por su nombre");
            System.out.println("3) Buscar equipo por nombre (se muestra su entrenador y su capitan)");
            System.out.println("4) Buscar equipo por nombre (se muestra su entrenador y sus jugadores)");
            System.out.println("5) Eliminar equipo");
            System.out.println("6) Salir");
            System.out.print("Ingrese una opción: ");
            opcion = getScanner().nextInt();
            getScanner().nextLine();
            switch (opcion) {
                case 1:
                    crearEquipo();
                    break;
                case 2:
                    buscarJugador();
                    break;
                case 3:
                    buscarEquipo1();
                    break;
                case 4:
                    buscarEquipo2();
                    break;
                case 5:
                    eliminarEquipo();
                    break;
                case 6:
                    System.out.println("Salio del programa");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
        while (opcion!=6);

    }
    private static Equipo crearEquipo(){
        Equipo crearEquipo = new Equipo();
        System.out.println("Creacion de un equipo");
        System.out.println("Ingrese el nombre del equipo: ");
        crearEquipo.setNombre(getScanner().nextLine());
        crearEquipo.setFechaDeCreacion(LocalDate.now());
        /*System.out.println("Ingrese la fecha de creacion del equipo (AAAA-MM-DD): ");
        crearEquipo.setFechaDeCreacion(LocalDate.parse(getScanner().nextLine()));
        */
        crearEquipo.setEntrenador(crearEntrenador());
        System.out.println("A continuacion se procede a la carga de los 5 jugadores del equipo");
        for (int i=0; i<2;i++){
            Jugador crearJugador = crearJugador();
            crearEquipo.getIntegranteDelEquipo().add(crearJugador);
            System.out.println("a " + crearEquipo.getIntegranteDelEquipo());
            crearJugador.setEquipo(crearEquipo.getNombre());
        }
        crearEquipo.getEquipos().add(crearEquipo);
        System.out.println("b " + crearEquipo.getEquipos());

        return crearEquipo;
    }

    private static Entrenador crearEntrenador(){
        Entrenador crearEntrenador = new Entrenador();
        System.out.println("Ingrese el nombre del entrenador: ");
        crearEntrenador.setNombreEntrenador(getScanner().nextLine());
        System.out.println("Ingrese el apellido del entrenador: ");
        crearEntrenador.setApellidoEntrenador(getScanner().nextLine());
        System.out.println("Ingrese la fecha de naciemiento del entrenador (AAAA-MM-DD): ");
        crearEntrenador.setFechaDeNacimiento(LocalDate.parse(getScanner().nextLine()));
        Period periodo = Period.between(crearEntrenador.getFechaDeNacimiento(),LocalDate.now());
        crearEntrenador.setEdadEntrenador(periodo.getYears());


        return crearEntrenador;

    }

    private static Jugador crearJugador(){
        Jugador crearJugador = new Jugador();
        crearJugador.setId(UUID.randomUUID());
        System.out.println("Ingrese el nombre del jugador: ");
        crearJugador.setNombreJugador(getScanner().nextLine());
        System.out.println("Ingrese el apellido del jugador: ");
        crearJugador.setApellidoJugador(getScanner().nextLine());
        System.out.println("Ingrese la altura del jugador: ");
        crearJugador.setAltura(getScanner().nextDouble());

        System.out.println("Seleccione la posicion en la que juega: \n 1)Arquero \n 2)Defensor \n 3)Mediocampista \n 4)Delantero ");
        int posicion = getScanner().nextInt();
        if (posicion ==1){
            crearJugador.setPosicion("Arquero");
        }
        else if (posicion ==2){
            crearJugador.setPosicion("Defensor");
        }
        else if (posicion ==3){
            crearJugador.setPosicion("Mediocampista");
        }
        else if (posicion ==4){
            crearJugador.setPosicion("Delantero");
        }
        else{
            System.out.println("La posicion seleccionada no existe");
        }
        getScanner().nextLine();
        System.out.println("Ingrese la cantidad de goles del jugador: ");
        crearJugador.setCantidadDeGoles(getScanner().nextInt());
        System.out.println("Ingrese la cantidad de partidos del jugador: ");
        crearJugador.setCantidadDePartidos(getScanner().nextInt());

        System.out.println("El jugador es capitan? \n 1)SI \n 2)NO ");
        int respuesta = getScanner().nextInt();
        if (respuesta == 1){
            crearJugador.setEsCapitan(true);
        }
        else{
            crearJugador.setEsCapitan(false);
        }

        System.out.println("Ingrese el numero de la camiseta: ");
        crearJugador.setNumeroCamiseta(getScanner().nextInt());

        return crearJugador;
    }

    private static void buscarJugador(){
        System.out.print("Ingrese el nombre del jugador: ");
        String nombreJugador = getScanner().nextLine();
        for (Equipo equipo : Equipo.getEquipos()){
            System.out.println("1 " + Equipo.getEquipos());
            for (Jugador jugador : Equipo.getIntegranteDelEquipo()){
                System.out.println("2 " + Equipo.getIntegranteDelEquipo());
                if (Jugador.getNombreJugador().equalsIgnoreCase(nombreJugador)){
                    System.out.println("Nombre: " + Jugador.getNombreJugador());
                    System.out.println("Apellido: " + Jugador.getApellidoJugador());
                    System.out.println("Posición: " + Jugador.getPosicion());
                /*    System.out.println("Es capitán?: " + Jugador.getEsCapitan());
                    System.out.println("Equipo: " + Jugador.getEquipo());
                  */  return;
                } else {
                    System.out.println("No se encontró ningún jugador con ese nombre");
                }
            }
        }
    }

    private static void buscarEquipo1(){
        System.out.println("Ingrese el nombre del equipo a buscar: ");
        String nombreEquipo = getScanner().nextLine();
        for (Equipo equipo : Equipo.getEquipos()) {
            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)){
                System.out.println("Nombre del equipo ingresado: " + equipo.getNombre());
                System.out.println("Nombre del entrenador: " + equipo.getEntrenador().getNombreEntrenador());
             //   System.out.println("Nombre del capitán: " + equipo.getIntegranteDelEquipo().getClass().getEsCapitan().getNombreJugador());nomuestracapitan
                return;
            }
            else{
                System.out.println("No se encontró ningún equipo con ese nombre");
            }
        }

    }

    private static void buscarEquipo2(){
        System.out.println("Ingrese el nombre del equipo a buscar: ");
        String nombreEquipo = getScanner().nextLine();
        for (Equipo equipo : Equipo.getEquipos()) {
            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)){
                System.out.println("Nombre del equipo ingresado: " + equipo.getNombre());
                System.out.println("Nombre del entrenador: " + equipo.getEntrenador().getNombreEntrenador());
                System.out.println("Nombre de los jugadores: ");
                for (Jugador jugador : equipo.getIntegranteDelEquipo()) {
                    System.out.println("- " + jugador.getNombreJugador() + " " + jugador.getApellidoJugador());
                }
                return;
            }
            else{
                System.out.println("No se encontró ningún equipo con ese nombre");
            }
        }

    }

    private static void eliminarEquipo(){
        System.out.print("Ingrese el nombre del equipo a eliminar: ");
        String nombreEquipo = getScanner().nextLine();
        for (int i = 0; i < Equipo.getEquipos().size(); i++) {
            if (Equipo.getEquipos().get(i).getNombre().equalsIgnoreCase(nombreEquipo)) {
                Equipo.getEquipos().remove(i);
                System.out.println("El equipo ha sido eliminado");
                return;
            }
        }
        System.out.println("No se encontró ningún equipo el mismo nombre");
    }

}
