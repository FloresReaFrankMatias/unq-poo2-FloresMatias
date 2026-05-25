package ar.edu.unq.poo2.tpComposite.UML;

public class Product {
	private  float price;
	private  String name;
	public Product(float price, String name) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.name= name;
	}
	public float getPrice( ) {
		return price;
	}
	public String getName() {
		return this.name ;
	}
	

}
