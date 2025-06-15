package List;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpManagementEx {
	public static void main(String[] args) 
	{
		ArrayList<EmpObj> list = new ArrayList<EmpObj>();		
		int ch = 0;
		do {
			
			System.out.println("\n1) Add new employee details");
			System.out.println("2) Update Employee details");
			System.out.println("3) Delete employee details");
			System.out.println("4) Display Employees details");
			System.out.println("5) Search employee details");
			System.out.println("6) exit");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Your Choice : ");
			int id;
			int ch2;
			String str;
			int temp;
			ch = sc.nextInt();
			switch (ch) {
				case 1:
					EmpObj e = new EmpObj();
					e.scan();
					list.add(e);
					break;
				case 2:
					do 
					{	
						System.out.println("\nEnter 1) for Update id");
						System.out.println("Enter 2) for Update name");
						System.out.println("Enter 3) for Update salary");
						System.out.println("Enter 4) for Update orgname");
						System.out.println("Enter 5) for Update All details");
						System.out.println("Enter 6) for Exit");
						System.out.print("Enter your choice : ");
						ch2 = sc.nextInt();
						
						switch(ch2)
						{
							case 1:
								System.out.print("\nEnter Employee Old Id to update id: ");
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
										System.out.println("Employees id is invalid");
									}
								}
								break;
							case 2:
								System.out.print("\nEnter Employee Id to update name: ");
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
										System.out.println("Employees id is invalid");
									}
								}
								break;
							case 3:
								System.out.print("\nEnter Employee Id to update salary: ");
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
										System.out.println("Employees id is invalid");
									}
								}
								break;
							case 4:
								System.out.print("\nEnter Employee Id to update orgname: ");
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
										System.out.println("Employees id is invalid");
									}
								}
								break;
							case 5:
								System.out.print("\nEnter Employee Id to update all Details: ");
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
										System.out.println("Employees id is invalid");
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
					System.out.println("Enter 3) for Delete by salary");
					System.out.println("Enter 4) for Delete by orgname");
					System.out.print("Enter your choice : ");
					ch2 = sc.nextInt();
					
					switch(ch2)
					{
						case 1:
							System.out.print("Enter the employee ID to delete their details : ");
							id = sc.nextInt();
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getId() == id)
								{
									list.remove(i);
									System.out.println("Employee details deleted successfully");
									break;
								}
								else if(i == list.size()-1)
								{
									System.out.println("Employees id is invalid");
								}
							}
							break;
						case 2:
							System.out.print("Enter the employee Name to delete their details : ");
							sc.nextLine();
							str = sc.nextLine();
							for(int i = 0;i<list.size();i++)
							{
								System.out.println(list.get(i).getName() + "  , "+str);
								if(list.get(i).getName() == str)
								{
									list.remove(i);
									System.out.println("Employee details deleted successfully");
								}
								else if(i == list.size()-1)
								{
									System.out.println("Employees id is invalid");
								}
							}
							break;
						case 3:
							System.out.print("Enter the employee Salary to delete their details : ");
							temp = sc.nextInt();
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getSalary() == temp)
								{
									list.remove(i);
									System.out.println("Employee details deleted successfully");
									break;
								}
								else if(i == list.size()-1)
								{
									System.out.println("Employees id is invalid");
								}
							}
							break;
						case 4:
							System.out.print("Enter the employee orgname to delete their details : ");
							sc.nextLine();
							str = sc.nextLine();
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getOrgname() == str)
								{
									list.remove(i);
									System.out.println("Employee details deleted successfully");
									break;
								}
								else if(i == list.size()-1)
								{
									System.out.println("Employees id is invalid");
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
						System.out.println(list.get(i).disp());
					}
					break;
				case 5:
					System.out.println("\nEnter 1) for search by id");
					System.out.println("Enter 2) for search by name");
					System.out.println("Enter 3) for search by salary");
					System.out.println("Enter 4) for search by orgname");
					System.out.print("Enter your choice : ");
					ch2 = sc.nextInt();
					
					switch(ch2)
					{
						case 1:
							System.out.print("Enter Employee ID : ");
							id = sc.nextInt();
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getId() == id)
								{
									System.out.println(list.get(i).disp());
								}
								else if(i == list.size()-1)
								{
									System.out.println("Employees id is not found");
								}
							}
							break;
						case 2:
							System.out.print("Enter Employee Name : ");
							sc.nextLine();
							String name = sc.nextLine();
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getName() ==  name)
								{
									System.out.println(list.get(i).disp());
								}
								else if(i == list.size()-1)
								{
									System.out.println("Employees id is not found");
								}
							}
							break;
						case 3:
							System.out.print("Enter Employee Salary : ");
							int sal = sc.nextInt();
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getSalary() == sal)
								{
									System.out.println(list.get(i).disp());
								}
								else if(i == list.size()-1)
								{
									System.out.println("Employees id is not found");
								}
							}
							break;
						case 4:
							System.out.print("Enter Employee orgname : ");
							sc.nextLine();
							String orgname = sc.nextLine();
							for(int i = 0;i<list.size();i++)
							{
								if(list.get(i).getOrgname() == orgname)
								{
									System.out.println(list.get(i).disp());
								}
								else if(i == list.size()-1)
								{
									System.out.println("Employees id is not found");
								}
							}
							break;
					}
					break;
					
				case 6:
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
		}while(ch != 6);
	}
	
}
