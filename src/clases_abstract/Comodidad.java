package clases_abstract;

import java.time.LocalDate;

public abstract class Comodidad {
    protected String nombre;
    protected double precio;

    public Comodidad(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract double calcularCosto(LocalDate fechaInicio, LocalDate fechaFin);
}