package ar.edu.unq.poo2.TP_Streams_Enums;

public class ActividadSemanal {

    private DiaDeLaSemana dia;
    private int horaInicio;
    private int duracion;      // en horas
    private Deporte deporte;

    public ActividadSemanal(DiaDeLaSemana dia, int horaInicio, int duracion, Deporte deporte) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.duracion = duracion;
        this.deporte = deporte;
    }

    // --- Costo ---

    public double getCosto() {
        double precioPorHora = esDiaBarato() ? 500 : 1000;
        double recargoPorComplejidad = deporte.getComplejidad() * 200;
        return (precioPorHora + recargoPorComplejidad) * duracion;
    }

    private boolean esDiaBarato() {
        return dia == DiaDeLaSemana.LUNES
            || dia == DiaDeLaSemana.MARTES
            || dia == DiaDeLaSemana.MIERCOLES;
    }

    // --- Getters ---

    public DiaDeLaSemana getDia() { return dia; }
    public int getHoraInicio()   { return horaInicio; }
    public int getDuracion()     { return duracion; }
    public Deporte getDeporte()  { return deporte; }

    // --- e) toString ---

    @Override
    public String toString() {
        return "Deporte: " + deporte.name()
             + ". Dia: " + dia.name()
             + " A LAS: " + horaInicio
             + " . Duración: " + duracion + " hora(s).";
    }
}
