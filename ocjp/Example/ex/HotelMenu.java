package ex;

import java.util.Scanner;

public class HotelMenu {
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("********** Menu **********");
		
		int temp;
		int qtyofpunjabi = 0;
		float punjabi = 399;
		int qtyofgujarati = 0;
		float gujarati= 449;
		int qtyofsouthindian = 0;
		float southindian= 449;	
		int qtyoftacos = 0;
		float tacos = 349;
		int qtyofburritos = 0;
		float burritos= 299;	
		int qtyofnachos = 0;
		float nachos= 289;	
		int qtyoflasagne = 0;
		float lasagne = 449;
		int qtyofrisotto = 0;
		float risotto= 299;	
		int qtyofpasta = 0;
		float pasta= 349;	
		float total = 0;
		
		String ch1;
		boolean a = true ;
		while(a)
		{
			System.out.println("\n1> for Indian");
			System.out.println("2> for Mexican");
			System.out.println("3> for Italian");
			System.out.println("0> for Exit");
			System.out.print("Enter your Choice : ");
	//		float bill = 0;
			
			boolean b = true;
			ch1 = sc.next();
			sc.nextLine();
			switch(ch1)
			{
			case "1":	
				while(b)
				{
					System.out.println("\n1> for Punjabi thali");	
					System.out.println("\tPrice : " + punjabi + "Rs");
					System.out.println("\tReat of dish : 4.6 ");
					
					System.out.println("\n2> for Gujarati thali");	
					System.out.println("\tPrice : " + gujarati + "Rs");
					System.out.println("\tReat of dish : 4.8 ");
					
					System.out.println("\n3> for South Indian thali");
					System.out.println("\tPrice : " + southindian + "Rs");
					System.out.println("\tReat of dish : 4.7 ");
					
					System.out.println("\n0> for exit");
					System.out.print("\nEnter your Choice : ");
					String ch2 = sc.next();
					temp = 0;
					sc.nextLine();
					
					switch(ch2)
					{
					case "1":
						System.out.println("\n>>Punjabi Thali");
						System.out.print("Enter Quantity of dish : ");
						temp = sc.nextInt();
						qtyofpunjabi = qtyofpunjabi+temp;
						if(qtyofpunjabi < 0)
						{
							qtyofpunjabi = qtyofpunjabi-temp;
							System.out.println("***Invalide Quantity of dish***");
						}
						else
							System.out.println("\t\t\t " + punjabi + " X (" + (qtyofpunjabi-temp) + " + " + temp + ") = " + qtyofpunjabi*punjabi);	
						sc.nextLine();
						sc.nextLine();
						break;
					
					case "2":
						System.out.println("\n>>Gujarati Thali");
						System.out.print("Enter Quantity of dish : ");
						temp = sc.nextInt();
						qtyofgujarati = qtyofgujarati + temp;
						if(qtyofgujarati < 0)
						{
							qtyofgujarati = qtyofgujarati - temp;
							System.out.println("***Invalide Quantity of dish***");
						}
						else
							System.out.println("\t\t\t " + gujarati + " X (" + (qtyofgujarati-temp) + " + " + temp + ") = " + qtyofgujarati*gujarati);
						sc.nextLine();
						sc.nextLine();
						break;
					
					case "3":
						System.out.println("\n>>South Indian Thali");
						System.out.print("Enter Quantity of dish : ");
						temp = sc.nextInt();
						qtyofsouthindian = qtyofsouthindian + temp;
						if(qtyofsouthindian < 0)
						{
							qtyofsouthindian = qtyofsouthindian - temp;
							System.out.println("***Invalide Quantity of dish***");
						}
						else
							System.out.println("\t\t\t " + southindian + " X (" + (qtyofsouthindian-temp) + " + " + temp + ") = " + qtyofsouthindian*southindian);	
						sc.nextLine();
						sc.nextLine();
						break;
					
					case"0":
						b = false; 
						sc.nextLine();
						break;
						
					default:
						System.out.println("***Invalide choice***");
						sc.nextLine();
						sc.nextLine();
					}
				}
				break;
			
			case "2":	
				while(b)
				{
					System.out.println("\n1> for Tacos");	
					System.out.println("\tPrice : " + tacos + "Rs");
					System.out.println("\tReat of dish : 4.5 ");
					
					System.out.println("\n2> for Burritos");
					System.out.println("\tPrice : " + burritos + "Rs");
					System.out.println("\tReat of dish : 4.7 ");
					
					System.out.println("\n3> for Nachos");
					System.out.println("\tPrice : " + nachos + "Rs");
					System.out.println("\tReat of dish : 4.9 ");
					
					System.out.println("\n0> for exit");
					System.out.print("\nEnter your Choice : ");
					String ch2 = sc.next();
					sc.nextLine();
					
					switch(ch2)
					{
					case "1":
						System.out.println("\n>>Tacos");
						System.out.print("Enter Quantity of dish : ");
						temp = sc.nextInt();
						qtyoftacos = qtyoftacos + temp;
						if(qtyoftacos < 0)
						{
							qtyoftacos = qtyoftacos - temp;
							System.out.println("***Invalide Quantity of dish***");
						}
						else
							System.out.println("\t\t\t " + tacos + " X (" + (qtyoftacos-temp) + " + " + temp + ") = " + qtyoftacos*tacos);	
						sc.nextLine();
						sc.nextLine();
						break;
					
					case "2":
						System.out.println("\n>>Burritos");
						System.out.print("Enter Quantity of dish : ");
						temp = sc.nextInt();
						qtyofburritos = qtyofburritos + temp;
						if(qtyofburritos < 0)
						{
							qtyofburritos = qtyofburritos - temp;
							System.out.println("***Invalide Quantity of dish***");
						}
						else
							System.out.println("\t\t\t " + burritos + " X (" + (qtyofburritos-temp) + " + " + temp + ") = " + qtyofburritos*burritos);
						sc.nextLine();
						sc.nextLine();
						break;
					
					case "3":
						System.out.println("\n>>Nachos");
						System.out.print("Enter Quantity of dish : ");
						temp = sc.nextInt();
						qtyofnachos = qtyofnachos + temp;
						if(qtyofnachos < 0)
						{
							qtyofnachos = qtyofnachos - temp;
							System.out.println("***Invalide Quantity of dish***");
						}
						else
							System.out.println("\t\t\t " + nachos + " X (" + (qtyofnachos-temp) + " + " + temp + ") = " + qtyofnachos*nachos);	
						sc.nextLine();
						sc.nextLine();
						break;
					
					case"0":
						b = false; 
						sc.nextLine();
						break;
						
					default:
						System.out.println("***Invalide choice***");
						sc.nextLine();
						sc.nextLine();
					}
				}
				break;
			
			case "3":	
				while(b)
				{
					System.out.println("\n1> for Lasagne");	
					System.out.println("\tPrice : " + lasagne + "Rs");
					System.out.println("\tReat of dish : 4.8 ");
					
					System.out.println("\n2> for Risotto");
					System.out.println("\tPrice : " + risotto + "Rs");
					System.out.println("\tReat of dish : 4.4 ");
					
					System.out.println("\n3> for Pasta");
					System.out.println("\tPrice : " + pasta + "Rs");
					System.out.println("\tReat of dish : 4.9 ");
					
					System.out.println("\n0> for exit");
					System.out.print("\nEnter your Choice : ");
					String ch2 = sc.next();
					sc.nextLine();
					
					switch(ch2)
					{
					case "1":
						System.out.println("\n>>Lasagne");
						System.out.print("Enter Quantity of dish : ");
						temp = sc.nextInt();
						qtyoflasagne = qtyoflasagne + temp;
						if(qtyoflasagne < 0)
						{
							qtyoflasagne = qtyoflasagne - temp;
							System.out.println("***Invalide Quantity of dish***");
						}
						else
							System.out.println("\t\t\t " + lasagne + " X (" + (qtyoflasagne-temp) + " + " + temp + ") = " + qtyoflasagne*lasagne);	
						sc.nextLine();
						sc.nextLine();
						break;
					
					case "2":
						System.out.println("\n>>Risotto");
						System.out.print("Enter Quantity of dish : ");
						temp = sc.nextInt();
						qtyofrisotto = qtyofrisotto + temp;
						if(qtyofrisotto < 0)
						{
							qtyofrisotto = qtyofrisotto - temp;
							System.out.println("***Invalide Quantity of dish***");
						}
						else
							System.out.println("\t\t\t " + risotto + " X (" + (qtyofrisotto-temp) + " + " + temp + ") = " + qtyofrisotto*risotto);
						sc.nextLine();
						sc.nextLine();
						break;
					
					case "3":
						System.out.println("\n>>Pasta");
						System.out.print("Enter Quantity of dish : ");
						temp = sc.nextInt();
						qtyofpasta = qtyofpasta + temp;
						if(qtyofpasta < 0)
						{
							qtyofpasta = qtyofpasta - temp;
							System.out.println("***Invalide Quantity of dish***");
						}
						else
							System.out.println("\t\t\t " + pasta + " X (" + (qtyofpasta-temp) + " + " + temp + ") = " + qtyofpasta*pasta);	
						sc.nextLine();
						sc.nextLine();
						break;
					
					case"0":
						b = false; 
						sc.nextLine();
						break;
						
					default:
						System.out.println("***Invalide choice***");
						sc.nextLine();
						sc.nextLine();
					}
				}
				break;
				
			case "0":
				a = false;
			}
		}
		
		System.out.println("\n\n---------------- Bill ----------------");
//		Indian food
		if(qtyofpunjabi != 0 || qtyofsouthindian != 0 || qtyofgujarati != 0)
		{
			System.out.println("\n**Indian food**");
			if(qtyofpunjabi != 0)
			{
				System.out.println("\n>>Punjabi Thali");
				System.out.println("\t\tQuantity : " + qtyofpunjabi);
				System.out.println("\t\tprice : " + punjabi + " X " + qtyofpunjabi + " = " + punjabi*qtyofpunjabi);
				total = total + (punjabi*qtyofpunjabi);
			}
			if(qtyofgujarati != 0)
			{
				System.out.println("\n>>Gujarati Thali");
				System.out.println("\t\tQuantity : " + qtyofgujarati);
				System.out.println("\t\tprice : " + gujarati + " X " + qtyofgujarati + " = " + gujarati*qtyofgujarati);
				total = total + (gujarati*qtyofgujarati);
			}
			if(qtyofsouthindian != 0)
			{
				System.out.println("\n>>South Indian Thali");
				System.out.println("\t\tQuantity : " + qtyofsouthindian);
				System.out.println("\t\tprice : " + southindian + " X " + qtyofsouthindian + " = " + southindian*qtyofsouthindian);
				total = total + (southindian*qtyofsouthindian);
			}		
		}
//		Mexican food
		if(qtyoftacos != 0 || qtyofburritos != 0 || qtyofnachos != 0)
		{
			System.out.println("\n**Mexican food**");
			if(qtyoftacos != 0)
			{
				System.out.println("\n>>Tacos");
				System.out.println("\t\tQuantity : " + qtyoftacos);
				System.out.println("\t\tprice : " + tacos + " X " + qtyoftacos + " = " + tacos*qtyoftacos);
				total = total + (tacos*qtyoftacos);
			}
			if(qtyofburritos != 0)
			{
				System.out.println("\n>>Burritos");
				System.out.println("\t\tQuantity : " + qtyofburritos);
				System.out.println("\t\tprice : " + burritos + " X " + qtyofburritos + " = " + burritos*qtyofburritos);
				total = total + (burritos*qtyofburritos);
			}
			if(qtyofnachos != 0)
			{
				System.out.println("\n>>Nachos");
				System.out.println("\t\tQuantity : " + qtyofnachos);
				System.out.println("\t\tprice : " + nachos + " X " + qtyofnachos + " = " + nachos*qtyofnachos);
				total = total + (nachos*qtyofnachos);
			}		
		}
//		Italian food
		if(qtyoflasagne != 0 || qtyofrisotto != 0 || qtyofpasta != 0)
		{
			System.out.println("\n**Italian food**");
			if(qtyoflasagne != 0)
			{
				System.out.println("\n>>Lasagne");
				System.out.println("\t\tQuantity : " + qtyoflasagne);
				System.out.println("\t\tprice : " + lasagne + " X " + qtyoflasagne + " = " + lasagne*qtyoflasagne);
				total = total + (lasagne*qtyoflasagne);
			}
			if(qtyofrisotto != 0)
			{
				System.out.println("\n>>Risotto");
				System.out.println("\t\tQuantity : " + qtyofrisotto);
				System.out.println("\t\tprice : " + risotto + " X " + qtyofrisotto + " = " + risotto*qtyofrisotto);
				total = total + (risotto*qtyofrisotto);
			}
			if(qtyofpasta != 0)
			{
				System.out.println("\n>>Pasta");
				System.out.println("\t\tQuantity : " + qtyofpasta);
				System.out.println("\t\tprice : " + pasta + " X " + qtyofpasta + " = " + pasta*qtyofpasta);
				total = total + (pasta*qtyofpasta);
			}		
		}
		System.out.print("\n\n--> Total bill : " + total);
	}
}
