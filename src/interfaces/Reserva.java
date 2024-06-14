package interfaces;

import java.time.LocalDate;

public interface Reserva {
    Cliente getCliente();
    Habitacion <?> getHabitacion();
    LocalDate getFechaInicio();
    LocalDate getFechaFin();
    double calcularCosto();
    void cancelarReserva();
    void modificarFechas(LocalDate fechaInicio, LocalDate fechaFin);
    
}