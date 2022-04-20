package com.training.java;
import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
	
	// Sort in ascending order of price
	public int compare(Product p1, Product p2) {
		
		if(p1.getPrice() > p2.getPrice()) {
			return 1;
			
		} else if(p1.getPrice() < p2.getPrice())
			
		{
			return -1;
		}
		
		else {
			return 0;
		}
	}

}
