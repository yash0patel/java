package List;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<ProductObj> list = new LinkedList<ProductObj>();
		int ch = 0;
		do {
			
			System.out.println("\n1) Add new Product details");
			System.out.println("2) Update Product details");
			System.out.println("3) Delete Product details");
			System.out.println("4) Display Product details");
			System.out.println("5) Search Product details");
			System.out.println("6) Short Product details");
			System.out.println("7) Exit");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Your Choice : ");
			ch = sc.nextInt();
			int ch2;
			int id;
			String str;
			int temp;
			switch (ch) {
				case 1:
//					ProductObj p = new ProductObj();
//					p.insert();
					list.add(new ProductObj(1,"a",11,"M"));
					list.add(new ProductObj(1,"a",10,"M"));
					list.add(new ProductObj(1,"a",13,"M"));
					list.add(new ProductObj(1,"a",12,"M"));
					list.add(new ProductObj(1,"a",11,"M"));
					break;
				case 2:
					do 
					{	
						System.out.println("\nEnter 1) for Update id");
						System.out.println("Enter 2) for Update name");
						System.out.println("Enter 3) for Update prize");
						System.out.println("Enter 4) for Update type");
						System.out.println("Enter 5) for Update All details");
						System.out.println("Enter 6) for Exit");
						System.out.print("Enter your choice : ");
						ch2 = sc.nextInt();
						
						switch(ch2)
						{
							case 1:
								System.out.print("\nEnter Product Old Id to update id: ");
								id = sc.nextInt();
								for(int i = 0;i<list.size();i++)
								{
									if(list.get(i).getId() == id)
									{
										list.get(i).update(ch2);
										break;
									}
									else if(i == list.size()-1)
									{
										System.out.println("Product id is invalid");
									}
								}
								break;
							case 2:
								System.out.print("\nEnter Product Id to update name: ");
								id = sc.nextInt();
								for(int i = 0;i<list.size();i++)
								{
									if(list.get(i).getId() == id)
									{
										list.get(i).update(ch2);
										break;
									}
									else if(i == list.size()-1)
									{
										System.out.println("Product id is invalid");
									}
								}
								break;
							case 3:
								System.out.print("\nEnter Product Id to update Prize: ");
								id = sc.nextInt();
								for(int i = 0;i<list.size();i++)
								{
									if(list.get(i).getId() == id)
									{
										list.get(i).update(ch2);
										break;
									}
									else if(i == list.size()-1)
									{
										System.out.println("Product id is invalid");
									}
								}
								break;
							case 4:
								System.out.print("\nEnter Product Id to update type: ");
								id = sc.nextInt();
								for(int i = 0;i<list.size();i++)
								{
									if(list.get(i).getId() == id)
									{
										list.get(i).update(ch2);
										break;
									}
									else if(i == list.size()-1)
									{
										System.out.println("Product id is invalid");
									}
								}
								break;
							case 5:
								System.out.print("\nEnter Product Id to update all Details: ");
								id = sc.nextInt();
								for(int i = 0;i<list.size();i++)
								{
									if(list.get(i).getId() == id)
									{
										list.get(i).update(ch2);
										break;
									}
									else if(i == list.size()-1)
									{
										System.out.println("Product id is invalid");
									}
								}
								break;
							case 6:
								try
								{
									Thread.sleep(500);
								}catch(InterruptedException ex)
								{
									ex.printStackTrace();
								}
								break;
							default:
								System.out.println("Invalid choice try again");
						}
					}while(ch2 != 6);
					break;

				case 3:
					System.out.println("\nEnter 1) for Delete by id");
					System.out.println("Enter 2) for Delete by name");
					System.out.println("Enter 3) for Delete by prize");
					System.out.println("Enter 4) for Delete by type");
					System.out.print("Enter your choice : ");
					ch2 = sc.nextInt();
					
					switch(ch2)
					{
						case 1:
							System.out.print("Enter the Product ID to delete their details : ");
							id = sc.nextInt();
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getId() == id)
								{
									list.remove(i);
									System.out.println("Product details deleted successfully");
									break;
								}
								else if(i == list.size()-1)
								{
									System.out.println("Product id is invalid");
								}
							}
							break;
						case 2:
							System.out.print("Enter the Product Name to delete their details : ");
							sc.nextLine();
							str = sc.nextLine();
							for(int i = 0;i<list.size();i++)
							{
								System.out.println(list.get(i).getName() + "  , "+str);
								if(list.get(i).getName() == str)
								{
									list.remove(i);
									System.out.println("Product details deleted successfully");
								}
								else if(i == list.size()-1)
								{
									System.out.println("Product id is invalid");
								}
							}
							break;
						case 3:
							System.out.print("Enter the Product prize to delete their details : ");
							temp = sc.nextInt();
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getPrize() == temp)
								{
									list.remove(i);
									System.out.println("Product details deleted successfully");
									break;
								}
								else if(i == list.size()-1)
								{
									System.out.println("Product id is invalid");
								}
							}
							break;
						case 4:
							System.out.print("Enter the Product type to delete their details : ");
							sc.nextLine();
							str = sc.nextLine();
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getType() == str)
								{
									list.remove(i);
									System.out.println("Product details deleted successfully");
									break;
								}
								else if(i == list.size()-1)
								{
									System.out.println("Product id is invalid");
								}
							}
							break;
						default:
							System.out.println("Invalid choice -----");
					}
					break;
					
				case 4:
					for(int i = 0;i<list.size();i++)
					{
						System.out.println(list.get(i).toString());
					}
					break;
					
				case 5:
					System.out.println("\nEnter 1) for search by id");
					System.out.println("Enter 2) for search by name");
					System.out.println("Enter 3) for search by Prize");
					System.out.println("Enter 4) for search by type");
					System.out.print("Enter your choice : ");
					ch2 = sc.nextInt();
					
					switch(ch2)
					{
						case 1:
							System.out.print("Enter Product ID : ");
							id = sc.nextInt();
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getId() == id)
								{
									System.out.println(list.get(i).toString());
								}
								else if(i == list.size()-1)
								{
									System.out.println("Product id is not found");
								}
							}
							break;
						case 2:
							System.out.print("Enter Product Name : ");
							sc.nextLine();
							String name = sc.nextLine();
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getName() ==  name)
								{
									System.out.println(list.get(i).toString());
								}
								else if(i == list.size()-1)
								{
									System.out.println("Product name is not found");
								}
							}
							break;
						case 3:
							System.out.print("Enter Product Prize : ");
							int pr = sc.nextInt();
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getPrize() == pr)
								{
									System.out.println(list.get(i).toString());
								}
								else if(i == list.size()-1)
								{
									System.out.println("Product Prize is not found");
								}
							}
							break;
						case 4:
							System.out.print("Enter Product Type : ");
							sc.nextLine();
							String type = sc.nextLine();
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getType() == type)
								{
									System.out.println(list.get(i).toString());
								}
								else if(i == list.size()-1)
								{
									System.out.println("Product prize is not found");
								}
							}
							break;
					}
					break;
					
				case 6:
					System.out.println("\nEnter 1) for sort prize Ascending order");
					System.out.println("Enter 2) for sort prize Descending order");
					System.out.print("Enter your choice : ");
					ch2 = sc.nextInt();
					temp = -1;
					int[] asc = new int[list.size()];
					for(int i = 0;i<list.size();i++)
					{
						asc[i] = list.get(i).getPrize();
					}
					Arrays.sort(asc);
					switch(ch2)
					{
						case 1:
							System.out.println("sorted by prize(Ascending order)");
							for(int i = 0;i<list.size();i++)
							{
								for(int j = 0;j<list.size();j++)
								{
									if(list.get(j).getPrize() == asc[i] && temp != asc[i])
									{
										System.out.println(list.get(j).toString());
									}
								}
								temp = asc[i];
							}
							break;
						case 2:
							System.out.println("sorted by prize(Descending order)");
							for(int i = list.size()-1;i>=0;i--)
							{
								for(int j = 0;j<list.size();j++)
								{
									if(list.get(j).getPrize() == asc[i] && temp != asc[i])
									{ 
										System.out.println(list.get(j).toString());
									}
								}
								temp = asc[i];
							}
							break;
					}
				case 7:
					System.out.println("Your system will be shutdown");
					try
					{
						Thread.sleep(1000);
					}catch(InterruptedException ex)
					{
						ex.printStackTrace();
					}
					System.exit(0);
					break;
				default:	
					System.out.println("invalid choise try again----");
			}
		}while(ch != 7);
	}
}
