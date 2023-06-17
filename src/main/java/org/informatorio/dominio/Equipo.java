package org.informatorio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private LocalDate fechaDeCreacion;
    private Entrenador entrenador;
    private Jugador jugador;
    public static List<Jugador> integranteDelEquipo = new ArrayList<>();
    public static List<Equipo> equipos = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }



    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", fechaDeCreacion=" + fechaDeCreacion +
                ", entrenador=" + entrenador +
                ", integranteDelEquipo=" + integranteDelEquipo +
                '}';
    }
}
