package basic;

import java.util.Scanner;

public class BasicCaculator {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,sum,sub,multy;
		float div;
		String ch;
		
		System.out.println("Enter two number : ");
		System.out.print("n1 : ");
		n1 = sc.nextInt();
		System.out.print("n2 : ");
		n2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter mathematics operation : ");
		ch = sc.next();
		
		switch(ch)
		{
		case "+":
			sum = n1+n2;
			System.out.println("Addition = " + sum);
			break;
		case "-":
			sub = n1-n2;
			System.out.println("Subtraction = " + sub);
			break;
		case "*":
			multy = n1*n2;
			System.out.println("Multyplication = " + multy);
			break;
		case "/":
			div = (float)n1/(float)n2;
			System.out.println("Division = " + div);
			break;
		default:
			System.out.print("Invalide choice");
		}
	}
}
