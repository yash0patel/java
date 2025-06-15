package ex;
import java.util.Scanner;
public class SumOfSeries {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        int sumA = 0;
        int sumB = 0;
        int count = 0;
        for (int i = 1; i <= 10; i++) 
        {
            sumA += i * i;
        }
        System.out.println("Sum of the series(1^2 + 2^2 + 3^2 + 4^2 + .... n^2): " + sumA);

        for (int j = 1; j <= 10; j*=2) 
        {
        	count++;
        	sumB += Math.pow(j, count);
        }
        System.out.println("Sum of the series(1^1 + 2^2 + 4^3 + .... N^n): " + sumB);
	}
}
