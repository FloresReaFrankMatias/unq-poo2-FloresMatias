package ar.edu.unq.poo2.tpComposite.UML;

public class SpeciaProduct extends Product {

	public SpeciaProduct(float price, String name) {
		// TODO Auto-generated constructor stub
		super(price, name);
	}
	@Override
	public float getPrice( ) {
		return super.getPrice() * 0.9f;
	}

}
