package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) { //positivo caso o primeiro seja maior que o segundo, 0 se forem iguais, ou negativo se o primeiro for menor que o segundo 
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); 
	}

	
}
