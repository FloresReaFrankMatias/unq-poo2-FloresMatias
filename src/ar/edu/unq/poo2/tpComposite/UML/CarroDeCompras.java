package ar.edu.unq.poo2.tpComposite.UML;

import java.util.ArrayList;
import java.util.List;

public class CarroDeCompras {
	private List<Product> products;
	
	public CarroDeCompras() {
		// TODO Auto-generated constructor stub
		this.products= new ArrayList<Product>();
	}
	
	public void setElements(List<Product> products) {
		this.products = products;
	}
	public List<Product> getElements() {
		return this.products;
	}
	public int totalRounded() {
		       //esto es para castear el valo a entero o sea redondear el valor a entero
		return (int) products.stream()
				             .mapToDouble( product -> product.getPrice())
				             .sum();
	}
	public float total() {
		return (float)products.stream()
				              .mapToDouble( product -> product.getPrice())
				              .sum() ;
	}

}
