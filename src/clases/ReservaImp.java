package clases;

import interfaces.Cliente;
import interfaces.Habitacion;
import interfaces.Reserva;
import clases_abstract.HabitacionGeneral;

import java.time.LocalDate;

public class ReservaImp implements Reserva {
    private Cliente cliente;
    private HabitacionGeneral<?> habitacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public ReservaImp(Cliente cliente, HabitacionGeneral<?> habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Override
    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public Habitacion<?> getHabitacion() {
        return habitacion;
    }

    @Override
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    @Override
    public LocalDate getFechaFin() {
        return fechaFin;
    }

    @Override
    public double calcularCosto() {
        return habitacion.calcularPrecioTotal(fechaInicio, fechaFin);
    }

    @Override
    public void cancelarReserva() {
        
    }

    @Override
    public void modificarFechas(LocalDate fechaInicio, LocalDate fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

}

