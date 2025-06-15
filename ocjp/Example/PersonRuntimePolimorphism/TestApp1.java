package PersonRuntimePolimorphism;

import java.util.Scanner;

public class TestApp1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Below choice : ");
		System.out.println("1) For School");
		System.out.println("2) For Organization");
		System.out.println("3) For Public place");
		int choice = sc.nextInt();
		
		Person person = null;
		switch(choice)
		{
			case 1:
					person = new School();
					person.getBehiviour();
					break;
			case 2:
					person = new Organization();
					person.getBehiviour();
					break;
			case 3:
					person = new Publicplace();
					person.getBehiviour();
					break;
			default:
					System.out.println("Invalide Choice");
		}
	}
	
}
