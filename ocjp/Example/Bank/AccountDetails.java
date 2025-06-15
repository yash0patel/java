package Bank;

import java.util.Scanner;

public class AccountDetails {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Operations operation = new Operations(125468,"yash",25000);
		
		double temp;
		boolean loop = true;
		while(loop)
		{
			System.out.println("1> Details");
			System.out.println("2> Deposit");
			System.out.println("3> Withdraw");
			System.out.println("4> Last Transaction");
			System.out.println("0> Exit");
			System.out.print("Enter your choice for do following operations : ");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1: 
					System.out.println();
					operation.getDetails();
					System.out.println();
					break;
				case 2:
					System.out.print("Enter Amount for Deposit : ");
					temp = sc.nextDouble();
					operation.setDeposit(temp);
					System.out.println();
					break;
				case 3:
					System.out.print("Enter Amount for Withdraw : ");
					temp = sc.nextDouble();
					operation.setWithdraw(temp);
					System.out.println();
					break;
				case 4:
					if(operation.check)
						System.out.println("Your last Transaction : "+(operation.transation?operation.getDeposit()+".rs (Deposit)":operation.getWithdraw()+".rs (Withdraw)"));
					else
						System.out.println("No Transaction");
					System.out.println();
					break;
				case 0:
					loop = false;
					break;
				default:
					System.out.println("Invalid Choice! try again");
					System.out.println();
			}
		}
	}
}
