package clases;

import interfaces.Cliente;
import interfaces.Reserva;


public class ClienteImple implements Cliente {
    private String nombre;
    private int puntos;

    public ClienteImple(String nombre) {
        this.nombre = nombre;
        this.puntos = 0; 
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getPuntos() {
        return puntos;
    }

    @Override
    public void acumulacionPuntos(Reserva reserva) {
        this.puntos += (int) reserva.calcularCosto();
    }
}
