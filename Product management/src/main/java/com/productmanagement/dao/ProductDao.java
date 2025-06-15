package com.productmanagement.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import com.productmanagement.bean.Productbean;
import com.productmanagement.util.DBConnection;


public class ProductDao {
	
	static String database = "USE JAVA";
	
	public int insertProduct(Productbean pbean)
	{
		String insertQuery = "INSERT INTO product VALUES ("+pbean.getProductID()+", '"+pbean.getLocation()+"', '"+pbean.getProductName()+"', '"+pbean.getProductType()+"', "+pbean.getValue()+" , STR_TO_DATE('"+pbean.getmDate()+"', '%d/%m/%Y'));";
		
		Connection conn = DBConnection.getConnection();
		
		Statement stmt = null;
		int rowsAffected = 0;
		if(conn != null)
		{
			try 
			{
				stmt = conn.createStatement();
				stmt.execute(database);
				rowsAffected = stmt.executeUpdate(insertQuery);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("ProductDao --insertProduct() ---Db not connected");
		}
		return rowsAffected;
	}
	
	public int updateProduct(Productbean pbean,int productID)
	{
		String updateQuery = "UPDATE product SET name = 'productID = "+pbean.getProductID()+", location = '"+pbean.getLocation()+"', productName = '"+pbean.getProductName()+"', productType = '"+pbean.getProductType()+"', value = "+pbean.getValue()+" , mDate = STR_TO_DATE('"+pbean.getmDate()+"', '%d/%m/%Y') WHERE productID = " + productID;
		Connection conn = DBConnection.getConnection();
		
		Statement stmt = null;
		int rowsAffected = 0;
		if(conn != null)
		{
			try 
			{
				stmt = conn.createStatement();
				stmt.execute(database);
				rowsAffected = stmt.executeUpdate(updateQuery);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("ProductDao --updateProduct() ---Db not connected");
		}
		return rowsAffected;
	}
	
	public int deleteProduct(int productID)
	{
		String deletQuery = "DELETE FROM product WHERE productID = " + productID;
		
		Connection conn = DBConnection.getConnection();
		
		Statement stmt = null;
		int rowsAffected = 0;
		if(conn != null)
		{
			try 
			{
				stmt = conn.createStatement();
				stmt.execute(database);
				rowsAffected = stmt.executeUpdate(deletQuery);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("productDao --deletproduct() ---DB not connected");
		}
		return rowsAffected;	
	}
	
	
	
	public static ArrayList<Productbean> getAllRecords(String column,String wheresyntex)
	{
		String selectQuery = "SELECT * FROM product "+wheresyntex+" order by "+column+";";
		Connection conn = DBConnection.getConnection();
		ArrayList<Productbean> list = new ArrayList<Productbean>();
		Productbean pbean = null;
		Statement stmt = null;
		ResultSet rs = null;
		if(conn != null)
		{
			try 
			{
				stmt = conn.createStatement();
				stmt.execute(database);
				rs = stmt.executeQuery(selectQuery);
				
				while(rs.next())
				{
					int productID = rs.getInt(1);       
					String location = rs.getString(2);		
					String productName = rs.getString(3); 	
					String productType = rs.getString(4);		
					int value = rs.getInt(5);	         
					String mDate = rs.getString(6);         
					pbean = new Productbean(productID, location, productName, productType, value, mDate);
					list.add(pbean);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("StudentDao --getAllRecords() ---DB not connected");
		}
		return list;	
	}
	
	public static ArrayList<Productbean> getAllRecords()
	{
		return getAllRecords("none",null);
	}
	
	public static void sortProduct(String column,String stype)
	{
		ArrayList<Productbean> list = getAllRecords(column +" "+ stype,null);
		for (int i = 0; i < list.size(); i++) 
		{
			Productbean pbean = list.get(i);
			System.out.println(pbean.getProductID() + "  " + pbean.getLocation() + "  " + pbean.getProductName() + "  " + pbean.getProductType() + "  " + pbean.getValue() + "  " + pbean.getmDate());
		}
		/*
		Collections.sort(list, new NameWiseComparator());

		if(stype == "asc")
		{		
			System.out.println("After name Sorting asc: ");
			for (int i = 0; i < list.size(); i++) 
			{
				Productbean pbean = list.get(i);
				System.out.println(pbean.getProductID() + "  " + pbean.getLocation() + "  " + pbean.getProductName() + "  " + pbean.getProductType() + "  " + pbean.getValue() + "  " + pbean.getmDate());
			}
		}
		else if (stype == "desc") 
		{
			System.out.println("After name Sorting desc: ");
			for (int i = list.size()-1; i >= 0; i--) 
			{
				Productbean pbean = list.get(i);
				System.out.println(pbean.getProductID() + "  " + pbean.getLocation() + "  " + pbean.getProductName() + "  " + pbean.getProductType() + "  " + pbean.getValue() + "  " + pbean.getmDate());
			}
		}
		else
		{
			System.out.println("Sorting type invalide....");
		}
		*/		
	}
	public void getProductByID(int... args)
	{
		ArrayList<Productbean> list = getAllRecords(null,"where productID in (" + Arrays.toString(args).substring(1, Arrays.toString(args).length()-1)+")");
		for (int i = 0; i < list.size(); i++) 
		{
			Productbean pbean = list.get(i);
			System.out.println(pbean.getProductID() + "  " + pbean.getLocation() + "  " + pbean.getProductName() + "  " + pbean.getProductType() + "  " + pbean.getValue() + "  " + pbean.getmDate());
		}
	}
	public void getProductByValue(int... args)
	{
		ArrayList<Productbean> list = getAllRecords(null,"where value in (" + Arrays.toString(args).substring(1, Arrays.toString(args).length()-1)+")");
		for (int i = 0; i < list.size(); i++) 
		{
			Productbean pbean = list.get(i);
			System.out.println(pbean.getProductID() + "  " + pbean.getLocation() + "  " + pbean.getProductName() + "  " + pbean.getProductType() + "  " + pbean.getValue() + "  " + pbean.getmDate());
		}
	}
	public void getProductByName(String... args)
	{
		String str = Arrays.toString(Arrays.stream(args).map(name -> "'" + name + "'").toArray());
		ArrayList<Productbean> list = getAllRecords(null,"where productName in (" + str.substring(1, str.length()-1)+")");
		for (int i = 0; i < list.size(); i++) 
		{
			Productbean pbean = list.get(i);
			System.out.println(pbean.getProductID() + "  " + pbean.getLocation() + "  " + pbean.getProductName() + "  " + pbean.getProductType() + "  " + pbean.getValue() + "  " + pbean.getmDate());
		}
	}
	public void getProductBymDAte(String... args)
	{
		String str = Arrays.toString(Arrays.stream(args).map(date -> "str_to_date(\'"+date+"\',\'%d/%m/%Y\')").toArray());
		ArrayList<Productbean> list = getAllRecords(null,"where mDate in (" + str.substring(1, str.length()-1)+")");
		for (int i = 0; i < list.size(); i++) 
		{
			Productbean pbean = list.get(i);
			System.out.println(pbean.getProductID() + "  " + pbean.getLocation() + "  " + pbean.getProductName() + "  " + pbean.getProductType() + "  " + pbean.getValue() + "  " + pbean.getmDate());
		}
	}
	public void getProductByType(String... args)
	{
		String str = Arrays.toString(Arrays.stream(args).map(name -> "'" + name + "'").toArray());
		ArrayList<Productbean> list = getAllRecords(null,"where productType in (" + str.substring(1, str.length()-1)+")");
		for (int i = 0; i < list.size(); i++) 
		{
			Productbean pbean = list.get(i);
			System.out.println(pbean.getProductID() + "  " + pbean.getLocation() + "  " + pbean.getProductName() + "  " + pbean.getProductType() + "  " + pbean.getValue() + "  " + pbean.getmDate());
		}
	}
	public void getProductByLocation(String... args)
	{
		String str = Arrays.toString(Arrays.stream(args).map(name -> "'" + name + "'").toArray());
		ArrayList<Productbean> list = getAllRecords(null,"where location in (" + str.substring(1, str.length()-1)+")");
		for (int i = 0; i < list.size(); i++) 
		{
			Productbean pbean = list.get(i);
			System.out.println(pbean.getProductID() + "  " + pbean.getLocation() + "  " + pbean.getProductName() + "  " + pbean.getProductType() + "  " + pbean.getValue() + "  " + pbean.getmDate());
		}
	}
	
	public static void main(String[] args) 
	{
		ProductDao dao = new ProductDao();
//		dao.insertProduct(new Productbean(128, "l6", "n2", "t6", 2500, "3/12/2024"));
//		dao.sortProduct("productID","desc");
//		dao.getProductByID(120,123);
//		dao.getProductByName("n2","n3");
//		dao.getProductBymDAte("30/12/2024","1/12/2024","10/12/2024");
//		dao.getProductByType("t1","t8");
//		dao.getProductByLocation("l1","l2");
//		dao.getProductByValue(2500,3500);
	}
	
}
