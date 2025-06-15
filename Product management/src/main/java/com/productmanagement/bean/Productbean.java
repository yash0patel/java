package com.productmanagement.bean;

public class Productbean
{
	private int productID;
    private String location;			
    private String productName; 		
    private String productType;		
    private int value;	
    private String mDate;
    
	public Productbean(int productID, String location, String productName, String productType, int value, String mDate) 
	{
		this.productID = productID;
		this.location = location;
		this.productName = productName;
		this.productType = productType;
		this.value = value;
		this.mDate = mDate;
	}
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getLocation() {
		return location;
	}
	public void setLocaAtion(String loction) {
		this.location = loction;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getmDate() {
		return mDate;
	}
	public void setmDate(String mDate) {
		this.mDate = mDate;
	}
}
