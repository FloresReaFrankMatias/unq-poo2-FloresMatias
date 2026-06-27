package ar.edu.unq.poo2.TP_Streams_Enums;

import java.util.*;
import java.util.stream.*;

public class SecretariaDeDeportes {

    private List<ActividadSemanal> actividades;

    public SecretariaDeDeportes(List<ActividadSemanal> actividades) {
        this.actividades = actividades;
    }

    // 1. Todas las actividades de FUTBOL
    public List<ActividadSemanal> actividadesDeFutbol() {
        return actividades.stream()
                .filter(a -> a.getDeporte() == Deporte.FUTBOL)
                .collect(Collectors.toList());
    }

    // 2. Actividades de una complejidad dada
    public List<ActividadSemanal> actividadesPorComplejidad(int complejidad) {
        return actividades.stream()
                .filter(a -> a.getDeporte().getComplejidad() == complejidad)
                .collect(Collectors.toList());
    }

    // 3. Cantidad total de horas
    public int horasTotales() {
        return actividades.stream()
                .mapToInt(ActividadSemanal::getDuracion)
                .sum();
    }

    // 4. Actividad de menor costo para un deporte dado
    public ActividadSemanal actividadMasBarata(Deporte deporte) {
        return actividades.stream()
                .filter(a -> a.getDeporte() == deporte)
                .min(Comparator.comparing(ActividadSemanal::getCosto))
                .orElseThrow(() -> new RuntimeException("No hay actividades de " + deporte));
    }

    // 5. Por cada deporte, la actividad más económica
    public Map<Deporte, ActividadSemanal> actividadMasBarataPorDeporte() {
        return actividades.stream()
                .collect(Collectors.toMap(
                        ActividadSemanal::getDeporte,
                        a -> a,
                        (a1, a2) -> a1.getCosto() <= a2.getCosto() ? a1 : a2
                ));
    }

    // f) Imprime todas las actividades
    public void imprimirActividades() {
        actividades.forEach(System.out::println);
    }
}
