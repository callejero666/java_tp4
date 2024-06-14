package clases;

import clases_abstract.Comodidad;
import clases_abstract.HabitacionGeneral;
import interfaces.Reserva;

import java.time.LocalDate;
import java.util.List;

public class GestDisponibilidad {
    @SuppressWarnings("unused")//auto correccion consultar xq?
    private List<HabitacionGeneral<? extends Comodidad>> habitaciones;
    private List<Reserva> reservas;

    public GestDisponibilidad(List<HabitacionGeneral<? extends Comodidad>> habitaciones, List<Reserva> reservas) {
        this.habitaciones = habitaciones;
        this.reservas = reservas;
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public int contarReservas(HabitacionGeneral<?> hab, LocalDate fechaInicio, LocalDate fechaFin) {
        int cantReservas = 0;
        for (Reserva reserva : reservas) {
            if (reserva.getHabitacion().equals(hab) &&
                (reserva.getFechaInicio().isBefore(fechaFin) && reserva.getFechaFin().isAfter(fechaInicio))) {
                cantReservas++;
            }
        }
        return cantReservas;
    }
}



