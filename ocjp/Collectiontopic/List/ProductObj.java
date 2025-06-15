package List;

import java.util.Scanner;

public class ProductObj {
	private int id;
	private String name;
	private int prize;
	private String type;
	
	public ProductObj() {}
	
	public ProductObj(int id,String name,int prize,String type) 
	{
		this.id = id;
		this.name = name;
		this.prize = prize;
		this.type = type;
	}

	@Override
	public String toString() {
		return "ProductObj [id=" + id + ", name=" + name + ", prize=" + prize + ", type=" + type + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void disp() 
	{
		toString();
	}
	
	public void insert()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Product details : ");
		System.out.print("Enter id : ");
		id = sc.nextInt();
		
		System.out.print("Enter name : ");
		name = sc.nextLine();
		sc.nextLine();
		
		System.out.print("Enter prize : ");
		prize = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter type : ");
		type = sc.nextLine();
		
		System.out.println("Product Data inserted successfully");
	}
	
	public void update(int x)
	{
		System.out.println("Enter following details for update Product information : ");
		Scanner sc = new Scanner(System.in);
		if(x == 1 || x == 5)
		{
			System.out.print("Enter New Id : ");
			id = sc.nextInt();
			sc.nextLine();
		}
		
		if(x == 2 || x == 5)
		{
			System.out.print("Enter name : ");
			name = sc.nextLine();
		}
		
		if(x == 3 || x == 5)
		{
			System.out.print("Enter prize : ");
			prize = sc.nextInt();
			sc.nextLine();
		}
		
		if(x == 4 || x == 5)
		{
			System.out.print("Enter type : ");
			type = sc.nextLine();
		}	
		System.out.println("Product Data Updated successfully");
	}
}
//insert product
//update
//delete
//display products
//searchi
//sorting