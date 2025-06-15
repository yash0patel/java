package basic;
import java.util.Scanner;
public class TestApp6 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter following subject marks(*/100)");
		System.out.print("maths : ");
		int maths = sc.nextInt();
		System.out.print("phy : ");
		int phy = sc.nextInt();
		System.out.print("che : ");
		int che = sc.nextInt();
		
		int sum,avg;
		float pr;
		
		sum = maths+phy+che;
		avg = sum/3;
		pr = ((float)sum*100)/300;
				
		System.out.println("SUM : "+sum);
		System.out.println("AVG : "+avg);
		
		if(pr > 90)
			System.out.println("A Grade");
		else if(pr > 70)
			System.out.println("B Grade");
		else if(pr > 50)
			System.out.println("C Grade");
		else if(pr > 33)
			System.out.println("D Grade");
		else
			System.out.println("Fail");
	}	
}
