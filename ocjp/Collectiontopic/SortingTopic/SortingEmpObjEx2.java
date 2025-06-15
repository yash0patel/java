package SortingTopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class SortingEmpObjEx2 {
	public static void main(String[] args) {
		ArrayList<EmpObj> list = new ArrayList<EmpObj>();
		
		EmpObj e1 = new EmpObj(101,"yash",2000,"xyz");
		EmpObj e3 = new EmpObj(102,"akash",2500,"pqr");
		EmpObj e2 = new EmpObj(105,"neel",3000,"abc");
		EmpObj e4 = new EmpObj(103,"jay",5000,"xyz");
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		System.out.println("Enter 1) to sort by ID");
		System.out.println("Enter 2) to sort by NAME");
		System.out.println("Enter 3) to sort by SALARY");
		System.out.println("Enter 4) to sort by ORGNAME");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1: 
			for (int i = 0; i<list.size();i++) 
			{
				list.get(i).sort_opt(1);
			}
			break;
		case 2: 
			for (int i = 0; i<list.size();i++) 
			{
				list.get(i).sort_opt(2);
			}
			break;
		case 3: 
			for (int i = 0; i<list.size();i++) 
			{
				list.get(i).sort_opt(3);
			}
			break;
		case 4: 
			for (int i = 0; i<list.size();i++) 
			{
				list.get(i).sort_opt(4);
			}
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}
		
		
		Collections.sort(list);
		
		
		for (int i = 0; i<list.size();i++) 
		{
			System.out.println(list.get(i).toString());
		}
	}
}
