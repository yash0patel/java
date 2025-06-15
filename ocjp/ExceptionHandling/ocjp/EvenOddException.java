package ocjp;

import java.util.Scanner;

public class EvenOddException {
	public static void isEven(int num) throws NotEvenException
	{
		if(num % 2 != 0) {
			throw new NotEvenException("\n\"Number is not a Even,\n\tPlease enter valid Number\"");
		}
		else
		{
			System.out.println("Number is Even");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number To check it's Even or not : ");
		int num = sc.nextInt();
		
		try {
			isEven(num);
		} catch (NotEvenException e) {
			e.printStackTrace();
		}
	}
}
