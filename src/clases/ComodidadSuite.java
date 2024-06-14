package clases;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import clases_abstract.Comodidad;

public class ComodidadSuite extends Comodidad {
    private String especialidad;

    public ComodidadSuite(String nombre, double precio, String especialidad) {
        super(nombre, precio);
        this.especialidad = especialidad;   
    }

    protected String getEspecialidad() {
        return especialidad;
    }

    @Override
    public double calcularCosto(LocalDate fechaInicio, LocalDate fechaFin) {
       long dias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
       return dias * precio * 1.25;
    }
}
