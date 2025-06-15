package ocjp;

import java.util.Scanner;

public class NestedTryBlock {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter n2 : ");
		int n2 = sc.nextInt();
		int ans = 0;
		
		try {
			try {
				ans = n1/n2;				
			} catch (ArithmeticException e) {
				System.out.println(e + "Hendled by catch Block");
				e.printStackTrace();
			}
			
			try {
				String name = null;
				System.out.println("name.length() : " + name.length());
			} catch (NullPointerException e) {
				System.out.println(e + "Hendled by catch Block");
				e.printStackTrace();
			}

			int a[] = new int[5];
		}
		catch(Exception e) {
			System.out.println("Exception Hendled by catch Block");
			e.printStackTrace();
		}
		
		System.out.print("ans : "+ans);
	}
}
