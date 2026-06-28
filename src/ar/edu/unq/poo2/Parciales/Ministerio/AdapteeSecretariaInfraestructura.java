package ar.edu.unq.poo2.Parciales.Ministerio;

//Adapter (Object Adapter) — Gamma roles:
//Target   → Secretaria
//Adaptee  → SecretariaDeInfraestructura
//Adapter  → AdaptadorSecretariaInfraestructura
//Client   → Ministerio (montoTotalAInvertir)
public class AdapteeSecretariaInfraestructura implements Secretaria {

	private final SecretariaDeInfraestructura adaptee;

public AdapteeSecretariaInfraestructura(SecretariaDeInfraestructura adaptee) {
   this.adaptee = adaptee;
}

@Override
public float montoTotal() {
   return adaptee.inversionTotal();
}
}