package ar.edu.unq.poo2.tp2;
import ar.edu.unq.poo2.tp2.empleados.Empleado;
import java.time.LocalDate;

public class Recibo {
	 private LocalDate fecha;
	    private String nombre;
	    private String direccion;
	    private float  sueldoBruto;
	    private float  sueldoNeto;
	    private String concepto  ;

	    public Recibo(Empleado e) {
	        this.fecha       = LocalDate.now();
	        this.nombre      = e.getNombre();
	        this.direccion   = e.getDireccion();
	        this.sueldoBruto = e.sueldoBruto();
	        this.sueldoNeto  = e.sueldoNeto();
	        this.concepto    = e.desgloseConceptos();

	    }
	public LocalDate getFecha() {
		return fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public float getSueldoBruto() {
		return sueldoBruto;
	}

	public float getSueldoNeto() {
		return sueldoNeto;
	}

	public String getConcepto() {
		return concepto;
	}
	    
	}
	