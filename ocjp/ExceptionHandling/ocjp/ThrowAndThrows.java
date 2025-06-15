package ocjp;

import java.util.Scanner;

public class ThrowAndThrows {
	public static void isValidForVote(int age) throws InvalidAgeException
	{
		if(age < 18) {
			throw new InvalidAgeException("\n\"Invalid Age,\n\tPlease enter valid age for Vote\"");
		}
		else
		{
			System.out.println("Welcome for Vote");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age : ");
		int age = sc.nextInt();
		
		try {
			isValidForVote(age);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}
}
