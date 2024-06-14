package clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import clases_abstract.Comodidad;

public class ComodidaBasica extends Comodidad {
    public ComodidaBasica (String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double calcularCosto(LocalDate fechaInicio, LocalDate fechaFin) {
        long dias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        return dias * precio;
    }

}
