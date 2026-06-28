package ar.edu.unq.poo2.Parciales.Ministerio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;
import java.util.List;
import static org.mockito.Mockito.*;


class MinisterioTest {

	 // Empleados mock con la interfaz del enunciado
    private Empleado ana;
    private Empleado luis;
    private Empleado marta;
    private Empleado carlos;
    private Empleado liderA;
    private Empleado liderB;
    private Empleado liderC;
    private Empleado liderProg;

    @BeforeEach
    void setUp() {
        ana      = empleado("Ana",    "Ingeniera",  1000f);
        luis     = empleado("Luis",   "Arquitecto", 1200f);
        marta    = empleado("Marta",  "Técnica",     900f);
        carlos   = empleado("Carlos", "Operario",    800f);
        liderA   = empleado("LiderA", "Líder",      1500f);
        liderB   = empleado("LiderB", "Líder",      1400f);
        liderC   = empleado("LiderC", "Líder",      1300f);
        liderProg = empleado("LiderP", "Director",  2000f);
    }

    // ── Test requerido por el enunciado ──────────────────────────────────────

    /**
     * Estructura:
     *   Programa MásAguaPotable
     *     ├─ Proyecto AmpliaciónRed
     *     └─ Programa MásExtracción
     *          ├─ Proyecto ConstrucciónPozoExtraccion
     *          └─ Proyecto ConexiónARed
     */
    @Test
    void testFechaDeInicioYInversionTotalMasAguaPotable() {
        // Proyectos hoja
        Proyecto ampliacion = new Proyecto( "AmpliaciónRed", liderA, LocalDate.of(2022, 3, 10), 20,  List.of(ana, luis));

        Proyecto pozo = new Proyecto("ConstrucciónPozoExtraccion", liderB, LocalDate.of(2022, 1, 5), 30, List.of(marta, carlos));

        Proyecto conexion = new Proyecto( "ConexiónARed", liderC,LocalDate.of(2022, 2, 15), 15, List.of(ana, carlos));

        // Programa anidado
        Programa masExtraccion = new Programa("MásExtracción", liderProg, 50_000f);
        masExtraccion.agregar(pozo);
        masExtraccion.agregar(conexion);

        // Programa raíz
        Programa masAguaPotable = new Programa("MásAguaPotable", liderProg, 100_000f);
        masAguaPotable.agregar(ampliacion);
        masAguaPotable.agregar(masExtraccion);

        // A. Fecha de inicio — debe ser la más temprana de todos los proyectos (2022-01-05)
        assertEquals(LocalDate.of(2022, 1, 5), masAguaPotable.fechaDeInicio());

        // B. Inversión total — calculada recursivamente
        float invAmpliacion   = calcularInversion(List.of(ana, luis), liderA, 20);
        float invPozo         = calcularInversion(List.of(marta, carlos), liderB, 30);
        float invConexion     = calcularInversion(List.of(ana, carlos), liderC, 15);
        float invMasExtraccion = 50_000f + invPozo + invConexion;
        float invEsperada     = 100_000f + invAmpliacion + invMasExtraccion;

        assertEquals(invEsperada, masAguaPotable.inversionTotal(), 0.01f);
    }

    @Test
    void testAdapterPermiteUsarSecretariaEnMinisterio() {
        Proyecto p = new Proyecto("P", liderA, LocalDate.now(), 10, List.of(ana));
        SecretariaDeInfraestructura infra = new SecretariaDeInfraestructura();
        infra.agregar(p);

        AdapteeSecretariaInfraestructura adapter = new AdapteeSecretariaInfraestructura(infra);
        Ministerio ministerio = new Ministerio();

        float total = ministerio.montoTotalAInvertir(List.of(adapter));
        assertEquals(infra.inversionTotal(), total, 0.01f);
    }

    // ── Helpers ─────────────────────────────────────────────────────────────
    private Empleado empleado(String nombre, String rol, float sueldo) {
        Empleado e = mock(Empleado.class);
        when(e.nombre()).thenReturn(nombre);
        when(e.rol()).thenReturn(rol);
        when(e.sueldoDiario()).thenReturn(sueldo);
        return e;
    }

    private float calcularInversion(List<Empleado> empleados, Empleado lider, int dias) {
        float sueldos = (float) empleados.stream()
                .mapToDouble(e -> e.sueldoDiario() * dias)
                .sum();
        return sueldos + lider.sueldoDiario() * dias * 1.30f;
    }

}
