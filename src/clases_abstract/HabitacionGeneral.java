package clases_abstract;

import java.util.List;

import interfaces.Habitacion;

import java.time.LocalDate;


public abstract class HabitacionGeneral <T extends Comodidad> implements Habitacion<T> {
    protected String tipo;
    protected double precio;
    protected List<T> comodidades;

    public HabitacionGeneral(String tipo, double precio, List<T> comodidades) {
        this.tipo = tipo;
        this.precio = precio;
        this.comodidades = comodidades;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public List<T> getComodidades() {
        return comodidades;
    }
    
    public abstract boolean estaDisponible(LocalDate fechaInicio, LocalDate fechaFin);

    public abstract double calcularPrecioTotal(LocalDate fechaInicio, LocalDate fechaFin);

}
