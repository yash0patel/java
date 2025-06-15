package ocjp;

import java.util.Scanner;

public class FInalyBlock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter n2 : ");
		int n2 = sc.nextInt();
		int ans = 0;
		
		try {
			ans = n1/n2;
		} catch (ArithmeticException e) {
			System.out.println("Exception Hendled by catch Block");
		}finally {
			System.out.println("Finaly Block");
		}
		
		System.out.print("ans : "+ans);
	}
}
