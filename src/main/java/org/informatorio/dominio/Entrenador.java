package org.informatorio.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entrenador {

    private String nombreEntrenador;

    private int edadEntrenador;
    private LocalDate fechaDeNacimiento;
    private String apellidoEntrenador;

    public int getEdadEntrenador() {
        return edadEntrenador;
    }

    public void setEdadEntrenador(int edadEntrenador) {
        this.edadEntrenador = edadEntrenador;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getApellidoEntrenador() {
        return apellidoEntrenador;
    }

    public void setApellidoEntrenador(String apellidoEntrenador) {
        this.apellidoEntrenador = apellidoEntrenador;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    private Equipo equipo;

    @Override
    public String toString() {
        return  nombreEntrenador ;
    }
}
