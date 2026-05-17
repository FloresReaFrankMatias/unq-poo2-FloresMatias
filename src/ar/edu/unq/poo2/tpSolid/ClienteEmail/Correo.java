package ar.edu.unq.poo2.tpSolid.ClienteEmail;

public class Correo {
	private String asunto;
	private String destinatario;
	private String cuerpo;

	public Correo(String asunto, String destinatario, String cuerpo) {
		// TODO Auto-generated constructor stub
		this.asunto = asunto;
		this.destinatario = destinatario;
		this.cuerpo = cuerpo;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
}
