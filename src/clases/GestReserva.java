package clases;

import interfaces.Reserva;
import interfaces.Cliente;
import clases_abstract.HabitacionGeneral;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

    
public class GestReserva {
    private List<Reserva> reservas;

    public GestReserva() {
        this.reservas = new ArrayList<>();
    }

    public void realizarReserva(Cliente cliente, HabitacionGeneral<?> habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        Reserva reserva = new ReservaImp(cliente, habitacion, fechaInicio, fechaFin);
        reservas.add(reserva);
        cliente.acumulacionPuntos(reserva);
    }

    public void cancelarReserva(Reserva reserva) {
        reservas.remove(reserva);
        reserva.cancelarReserva();
    }

    public void modificarReserva(Reserva reserva, LocalDate fechaInicio, LocalDate fechaFin) {
        reserva.modificarFechas(fechaInicio, fechaFin);
    }

    public double calcCostoReserva(Reserva reserva) {
        return reserva.calcularCosto();
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}

