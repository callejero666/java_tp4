package interfaces;

import java.time.LocalDate;
import java.util.List;

import clases_abstract.Comodidad;


public interface Habitacion<T extends Comodidad> {
    String getTipo();
    double getPrecio();
    List<T> getComodidades();
    boolean estaDisponible(LocalDate fechaInicio, LocalDate fechaFin);
    double calcularPrecioTotal(LocalDate fechaInicio, LocalDate fechaFin);
}

