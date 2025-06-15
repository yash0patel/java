package basic;

import java.util.Scanner;

public class TestApp7 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		System.out.print("Enter n1 : ");
		n1 = sc.nextInt();
		System.out.print("Enter n2 : ");
		n2 = sc.nextInt();
		System.out.print("Enter n3 : ");
		n3 = sc.nextInt();
		
		int lg;
		lg = n1>n2?n1:n2;
		lg = lg>n3?lg:n3;
		
		if(n1 == n2 && n2 == n3)
			System.out.print("All number are same");
		else if(n1 == n2)
			if(n1 == lg)
				System.out.print(n1 + "(n1) and "+n2+ "(n2) are greter than n3");
			else
				System.out.print(n3 + "(n3) is grter than "+ n1 + "(n1) and "+n2+ "(n2)");
		else if(n1 == n3)
			if(n1 == lg)
				System.out.print(n1 +"(n1) and " + n3+"(n3) are greter than n2");	
			else
				System.out.print(n2 + "(n2) is grter than "+ n1 + "(n1) and "+n3+ "(n3)");
		else if(n2 == n3)
			if(n2 == lg)
				System.out.print(n2 +"(n2) and " + n3+"(n3) are greter than n1");
			else
				System.out.print(n1 + "(n1) is grter than "+ n2 + "(n2) and "+n3+ "(n2)");
		else
			System.out.print(lg+" is biggest number");
	}
}