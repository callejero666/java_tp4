

package clases;


import clases_abstract.HabitacionGeneral;

import java.time.LocalDate;
import java.util.List;


public class HabitacionSimple extends HabitacionGeneral<ComodidaBasica> {

    public HabitacionSimple(String tipo, double precio, List<ComodidaBasica> comodidades) {
        super(tipo, precio, comodidades);
    }

    @Override
    public boolean estaDisponible(LocalDate fechaInicio, LocalDate fechaFin) {
        return true;
    }

    @Override
    public double calcularPrecioTotal(LocalDate fechaInicio, LocalDate fechaFin) {
        return getPrecio() * (fechaFin.toEpochDay() - fechaInicio.toEpochDay());
    }
}
