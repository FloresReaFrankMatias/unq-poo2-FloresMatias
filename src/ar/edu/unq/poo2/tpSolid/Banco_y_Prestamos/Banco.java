package ar.edu.unq.poo2.tpSolid.Banco_y_Prestamos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Banco {
	private Set<Cliente> clientes;
	private List<SolicitudCredito> solicitudes;
	
	
	public Banco() {
		this.clientes = new HashSet<Cliente>();
		this.solicitudes = new ArrayList<SolicitudCredito>();
	}
	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	public void registrarSolicitud(SolicitudCredito solicitud) {
		this.validarSolicitud(solicitud.getCliente());
		solicitudes.add(solicitud);
	}
	public void validarSolicitud(Cliente cliente) {
		if (!clientes.contains(cliente)) {
			throw new RuntimeException("El cliente no esta registrado en el banco");
		}
	}
	
	public Double getMontoTotalADesembolsar() {
		return solicitudes.stream()
				          .filter(solicitud -> solicitud.esAceptable(solicitud.getCliente()))
				          .mapToDouble(solicitud -> solicitud.getMonto())
				          .sum();
	}
	public void otorgarSolicitudes() {
		solicitudes.stream()
				 .filter(solicitud -> solicitud.esAceptable(solicitud.getCliente()))
				 .forEach(solicitud -> otorgarCredito(solicitud));
		
		this.solicitudes.clear();
	}
	
	public void otorgarCredito(SolicitudCredito solicitud) {
		Cliente cliente = solicitud.getCliente();
		double monto = solicitud.getMonto();
		cliente.recibirCredito(monto);
	}
	

}
