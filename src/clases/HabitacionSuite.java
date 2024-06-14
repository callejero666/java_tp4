

package clases;


import clases_abstract.HabitacionGeneral;

import java.time.LocalDate;
import java.util.List;

public class HabitacionSuite extends HabitacionGeneral<ComodidadSuite> {
    public HabitacionSuite(String tipo, double precio, List<ComodidadSuite> comodidades) {
        super(tipo, precio, comodidades);
    }

    @Override
    public boolean estaDisponible(LocalDate fechaInicio, LocalDate fechaFin) {
        return true;
    }

    @Override
    public double calcularPrecioTotal(LocalDate fechaInicio, LocalDate fechaFin) {
        double total = precio;
        if (fechaFin.isAfter(fechaInicio.plusDays(5))) {
            total *= 0.85;
        }
        return total;
    }
}
