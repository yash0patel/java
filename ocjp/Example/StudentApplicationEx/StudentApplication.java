package StudentApplicationEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentApplication {
	public static void main(String[] args) {
		ArrayList<StudentObj> list = new ArrayList<StudentObj>();
		
		int ch = 0;
		do {
			
			System.out.println("\n1) Add new Student details");
			System.out.println("2) Update Student details");
			System.out.println("3) Delete Student details");
			System.out.println("4) Display Student details");
			System.out.println("5) Search Student details");
			System.out.println("6) Sorting Student details");
			System.out.println("7) exit");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Your Choice : ");
			int rno;
			int ch2;
			String str;
			int temp;
			ch = sc.nextInt();
			switch (ch) {
				case 1:
//					StudentObj s = new StudentObj();
//					s.scan();
//					list.add(s);
					
					StudentObj s1 = new StudentObj(1, "yash", 9, 80);
					StudentObj s2 = new StudentObj(3, "ayush", 10, 90);
					StudentObj s3 = new StudentObj(2, "neel", 11, 80);
					StudentObj s4 = new StudentObj(4, "jay", 12, 100);
					list.add(s1);
					list.add(s2);
					list.add(s3);
					list.add(s4);
					
					break;
				case 2:
					do 
					{	
						System.out.println("\nEnter 1) for Update Roll number");
						System.out.println("Enter 2) for Update Name");
						System.out.println("Enter 3) for Update Std");
						System.out.println("Enter 4) for Update Marks");
						System.out.println("Enter 5) for Update All details");
						System.out.println("Enter 6) for Exit");
						System.out.print("Enter your choice : ");
						ch2 = sc.nextInt();
						
						switch(ch2)
						{
							case 1:
								System.out.print("\nEnter Student Old Roll Number to update Roll Number: ");
								rno = sc.nextInt();
								for(int i = 0;i<list.size();i++)
								{
									if(list.get(i).getRno() == rno)
									{
										list.get(i).update(ch2);
										break;
									}
									else if(i == list.size()-1)
									{
										System.out.println("Student Roll number is invalid");
									}
								}
								break;
							case 2:
								System.out.print("\nEnter Student Roll number to update name: ");
								rno = sc.nextInt();
								for(int i = 0;i<list.size();i++)
								{
									if(list.get(i).getRno() == rno)
									{
										list.get(i).update(ch2);
										break;
									}
									else if(i == list.size()-1)
									{
										System.out.println("Student Roll number is invalid");
									}
								}
								break;
							case 3:
								System.out.print("\nEnter Student Roll number to update salary: ");
								rno = sc.nextInt();
								for(int i = 0;i<list.size();i++)
								{
									if(list.get(i).getRno() == rno)
									{
										list.get(i).update(ch2);
										break;
									}
									else if(i == list.size()-1)
									{
										System.out.println("Student Roll number is invalid");
									}
								}
								break;
							case 4:
								System.out.print("\nEnter Student Roll number to update orgname: ");
								rno = sc.nextInt();
								for(int i = 0;i<list.size();i++)
								{
									if(list.get(i).getRno() == rno)
									{
										list.get(i).update(ch2);
										break;
									}
									else if(i == list.size()-1)
									{
										System.out.println("Student Roll number is invalid");
									}
								}
								break;
							case 5:
								System.out.print("\nEnter Student Roll number to update all Details: ");
								rno = sc.nextInt();
								for(int i = 0;i<list.size();i++)
								{
									if(list.get(i).getRno() == rno)
									{
										list.get(i).update(ch2);
										break;
									}
									else if(i == list.size()-1)
									{
										System.out.println("Student Roll number is invalid");
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
					System.out.println("\nEnter 1) for Delete by Roll number");
					System.out.println("Enter 2) for Delete by Name");
					System.out.println("Enter 3) for Delete by Std");
					System.out.println("Enter 4) for Delete by Marks");
					System.out.print("Enter your choice : ");
					ch2 = sc.nextInt();
					
					switch(ch2)
					{
						case 1:
							System.out.print("Enter the Student Roll number to delete their details : ");
							rno = sc.nextInt();
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getRno() == rno)
								{
									list.remove(i);
									System.out.println("Student details deleted successfully");
									break;
								}
								else if(i == list.size()-1)
								{
									System.out.println("Student Roll number is invalid");
								}
							}
							break;
						case 2:
							System.out.print("Enter the Student Name to delete their details : ");
							sc.nextLine();
							str = sc.nextLine();
							for(int i = 0;i<list.size();i++)
							{
//								System.out.println(list.get(i).getName() + "  , "+str);
								if(list.get(i).getName().equalsIgnoreCase(str))
								{
									list.remove(i);
									System.out.println("Student details deleted successfully");
								}
								else if(i == list.size()-1)
								{
									System.out.println("Student Name is invalid");
								}
							}
							break;
						case 3:
							System.out.print("Enter the Student std to delete their details : ");
							temp = sc.nextInt();
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getStd() == temp)
								{
									list.remove(i);
									System.out.println("Student details deleted successfully");
									break;
								}
								else if(i == list.size()-1)
								{
									System.out.println("Student Std is invalid");
								}
							}
							break;
						case 4:
							System.out.print("Enter the Student Marks to delete their details : ");
							temp = sc.nextInt();
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getMarks() == temp)
								{
									list.remove(i);
									System.out.println("Student details deleted successfully");
									break;
								}
								else if(i == list.size()-1)
								{
									System.out.println("Student Marks is invalid");
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
					System.out.println("\nEnter 1) for search by rno");
					System.out.println("Enter 2) for search by name");
					System.out.println("Enter 3) for search by std");
					System.out.println("Enter 4) for search by marks");
					System.out.print("Enter your choice : ");
					ch2 = sc.nextInt();
					
					switch(ch2)
					{
						case 1:
							System.out.print("Enter Student Roll number : ");
							rno = sc.nextInt();
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getRno() == rno)
								{
									System.out.println(list.get(i).toString());
								}
								else if(i == list.size()-1)
								{
									System.out.println("Student Roll number is not found");
								}
							}
							break;
						case 2:
							System.out.print("Enter Student Name : ");
							sc.nextLine();
							String name = sc.nextLine();
							temp = 0;
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getName().equalsIgnoreCase(name))
								{
									System.out.println(list.get(i).toString());
									temp++;
								}
								else if(i == list.size()-1 && temp == 0)
								{
									System.out.println("Student Name is not found");
								}
							}
							break;
						case 3:
							System.out.print("Enter Employee std : ");
							int std = sc.nextInt();
							temp = 0;
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getStd() == std)
								{
									System.out.println(list.get(i).toString());
									temp++;
								}
								else if(i == list.size()-1 && temp == 0)
								{
									System.out.println("std is not found");
								}
							}
							break;
						case 4:
							System.out.print("Enter Student Marks : ");
							int marks = sc.nextInt();
							temp = 0;
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getMarks() == marks)
								{
									System.out.println(list.get(i).toString());
									temp++;
								}
								else if(i == list.size()-1 && temp == 0)
								{
									System.out.println("Marks is not found");
								}
							}
							break;
					}
					break;
					
				case 6:
					System.out.println("\nEnter 1) for sorting Ascending Order");
					System.out.println("Enter 2) for sorting Descending Order");
					System.out.print("Enter your choice : ");
					ch2 = sc.nextInt();
					System.out.println("Enter 1) to sort by rno");
					System.out.println("Enter 2) to sort by name");
					System.out.println("Enter 3) to sort by std");
					System.out.println("Enter 4) to sort by marks");
					int ch3 = sc.nextInt();
					switch(ch3)
					{
						case 1:
							Collections.sort(list, new RnoWiseComparator());
							break;
						case 2:
							Collections.sort(list, new NameWiseComparator());
							break;
						case 3:
							Collections.sort(list, new StdWiseComparator());
							break;
						case 4:
							Collections.sort(list, new MarksWiseComparator());
							break;
						default:
							System.out.println("Invalid choice -----");
					}
					
					switch(ch2)
					{
						case 1:
							for (int i = 0; i < list.size(); i++) 
							{
								System.out.println(list.get(i).toString());
							}
							break;
						case 2:
							for (int i = list.size()-1; i >= 0; i--) 
							{
								System.out.println(list.get(i).toString());
							}
					}
					break;
					
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
