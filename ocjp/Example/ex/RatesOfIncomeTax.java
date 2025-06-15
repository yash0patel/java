package ex;

import java.util.Scanner;

public class RatesOfIncomeTax {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int id;
		double salary;
		double tax;
		
		System.out.println("Enter Following details :");
		System.out.print("Name : ");
		name = sc.nextLine();
		
		System.out.print("Identification number : ");
		id = sc.nextInt();
		
		System.out.print("Annual Salary : ");
		salary = sc.nextDouble();

		if(salary > 40000 && salary <= 60000)
		{
			tax = salary*0.1;
		}
		else if(salary>60000 && salary<=120000)
		{
			tax = salary*0.12;
		}
		else if(salary > 120000)
		{
			tax = salary*0.15;
		}
		else
		{
			tax = 0;
		}
		System.out.println("name\tid\tAnnual salary\t\tIncome Tax");
		System.out.println(name+"\t"+id+"\t"+salary+"       \t\t"+tax);
	}
}
