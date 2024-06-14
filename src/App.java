

import clases_abstract.Comodidad;
import clases_abstract.HabitacionGeneral;
import interfaces.Cliente;
import interfaces.Reserva;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import clases.ClienteImple;
import clases.ComodidaBasica;
import clases.ComodidadSuite;
import clases.GestDisponibilidad;
import clases.GestReserva;
import clases.HabitacionSimple;
import clases.HabitacionSuite;


public class App {
    private static GestDisponibilidad gestorDisp;

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<HabitacionGeneral<? extends Comodidad>> habitaciones = new ArrayList<>();
        List<Reserva> reservas = new ArrayList<>();
        gestorDisp = new GestDisponibilidad(habitaciones, reservas);

        // Crear instancias de habitaciones
        HabitacionSimple habitacionSimple = new HabitacionSimple("Simple", 100, new ArrayList<>());
        HabitacionSuite habitacionSuite = new HabitacionSuite("Suite", 500, new ArrayList<>());

        habitaciones.add(habitacionSimple);
        habitaciones.add(habitacionSuite);

        // Crear instancias de comodidades
        ComodidaBasica comodidad1 = new ComodidaBasica("WiFi", 10);
        ComodidaBasica comodidad2 = new ComodidaBasica("Desayuno", 20);
        ComodidadSuite comodidad3 = new ComodidadSuite("Minibar", 50, "Incluye bebidas premium");
        ComodidadSuite comodidad4 = new ComodidadSuite("Jacuzzi", 100, "Jacuzzi privado");
        ComodidaBasica comodidad5 = new ComodidaBasica("TV", 15);
        ComodidaBasica comodidad6 = new ComodidaBasica("Aire acondicionado", 25);

        // Crear instancias de clientes
        Cliente cliente1 = new ClienteImple("Luis Angel Tula");
        Cliente cliente2 = new ClienteImple("Jorge Luis Moya");

        // Instanciar el gestor de reservas
        GestReserva gestorReservas = new GestReserva();

        // Realizar reservas para cada cliente
        gestorReservas.realizarReserva(cliente1, habitacionSimple, LocalDate.now(), LocalDate.now().plusDays(3));
        gestorReservas.realizarReserva(cliente1, habitacionSuite, LocalDate.now().plusDays(12), LocalDate.now().plusDays(15));
        gestorReservas.realizarReserva(cliente2, habitacionSimple, LocalDate.now(), LocalDate.now().plusDays(2));

        // Imprimir reservas y costos
        for (Reserva reserva : gestorReservas.getReservas()) {
            System.out.println("Reserva para " + reserva.getCliente().getNombre() + 
                               " en habitación " + reserva.getHabitacion().getTipo() + 
                               " del " + reserva.getFechaInicio() + " al " + reserva.getFechaFin());
            System.out.println("Costo total: $" + reserva.calcularCosto());
        }

        // Calcular y mostrar puntos acumulados por cada cliente
        System.out.println("Puntos acumulados por Cliente 1: " + cliente1.getPuntos());
        System.out.println("Puntos acumulados por Cliente 2: " + cliente2.getPuntos());
    }

    public static GestDisponibilidad getGestor() {
        return gestorDisp;
    }
}
