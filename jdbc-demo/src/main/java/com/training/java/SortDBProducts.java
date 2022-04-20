package com.training.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortDBProducts {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		// select all the attributes from the product table
		
		List<Product> productList = new ArrayList<Product>();
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		String url = "jdbc:sqlserver://localhost:1433;" +
		"databaseName = mars_db;" +
		"encrypt = true;trustServerCertificate = true";
		
		String user = "sa";
		
		String password = "Gladwin123";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		if(con != null) {
			System.out.println("Connection established successfully!!");
		
		
		String query = "select * from mars_product";
		
		Statement stmt  = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(query);
			
		
		while(rs.next()) {
			String productId = rs.getString("prod_id");
			String productName = rs.getString("prod_name");
			String productDescription = rs.getString("prod_desc");
			double productPrice = rs.getDouble("price");
			
			Product product = new Product(productId,productName,productDescription,productPrice);
			product.setProd_id(productId);
			product.setProd_name(productName);
			product.setProd_desc(productDescription);
			product.setPrice(productPrice);
			productList.add(product);
			
			
			//sort in ascending order
			Collections.sort(productList, new PriceComparator());
		}
		
		for(Product products:productList) {
			
		System.out.println("Product Id: "  +products.getProd_id() + " Product Name: " +products.getProd_name()+
				 " Product Description: " + products.getProd_desc()  + " Product Price: $" +products.getPrice());
			

		}		
				
	}
	else {
		System.out.println("Connection refused!!");
	}

	}
}

