package com.productmanagement.bean;

import java.util.Comparator;

public class NameWiseComparator implements Comparator<Productbean>{
	public int compare(Productbean p1, Productbean p2) {
		// TODO Auto-generated method stub
		return p1.getProductName().compareTo(p2.getProductName());
	}
}
