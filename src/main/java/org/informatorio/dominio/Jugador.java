package org.informatorio.dominio;

import java.util.UUID;

public class Jugador {
    private static UUID id;
    private static String nombreJugador;
    private static String apellidoJugador;
    private double altura;
    private static String posicion;
    private static Integer cantidadDeGoles;
    private static Integer cantidadDePartidos;
    private static boolean esCapitan;
    private static Integer numeroCamiseta;
    private static String equipo;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public static String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public static String getApellidoJugador() {
        return apellidoJugador;
    }

    public void setApellidoJugador(String apellidoJugador) {
        this.apellidoJugador = apellidoJugador;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public static Integer getCantidadDeGoles() {
        return cantidadDeGoles;
    }

    public void setCantidadDeGoles(Integer cantidadDeGoles) {
        this.cantidadDeGoles = cantidadDeGoles;
    }

    public static Integer getCantidadDePartidos() {
        return cantidadDePartidos;
    }

    public void setCantidadDePartidos(Integer cantidadDePartidos) {
        this.cantidadDePartidos = cantidadDePartidos;
    }

    public static boolean getEsCapitan() {
        return esCapitan;
    }

    public void setEsCapitan(boolean esCapitan) {
        this.esCapitan = esCapitan;
    }

    public static Integer getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(Integer numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public static String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return  nombreJugador + '\'' + equipo;
    }
}
