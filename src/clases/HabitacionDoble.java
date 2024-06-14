package clases;


import clases_abstract.HabitacionGeneral;

import java.time.LocalDate;
import java.util.List;

public class HabitacionDoble extends HabitacionGeneral<ComodidadSuite> {
    public HabitacionDoble(String tipo, double precio, List<ComodidadSuite> comodidades) {
        super(tipo, precio, comodidades);
    }

    @Override
    public boolean estaDisponible(LocalDate fechaInicio, LocalDate fechaFin) {
        return true;
    }

    @Override
    public double calcularPrecioTotal(LocalDate fechaInicio, LocalDate fechaFin) {
        double total = getPrecio();
        for (ComodidadSuite comodidad : getComodidades()) {
            total += comodidad.calcularCosto(fechaInicio, fechaFin);
        }
        return total;
    }
}
