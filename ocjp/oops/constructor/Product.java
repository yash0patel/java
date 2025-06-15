package constructor;

public class Product {
	private int id;
	private String name;
	private int price;
	private String mdate;
	private String orgname;
	public Product()
	{
		id = 1001;
		orgname = "xyz ab";	
	}
	
	public Product(int id,String name,int price,String mdate)
	{
		this.id =id;
		this.name = name;
		this.price = price;
		this.mdate = mdate;
	}
	
	public Product(Product p)
	{
		this.name = p.name;
		this.price = p.price;
		this.mdate = p.mdate;
	}
	
	public static void main(String[] args)
	{
		Product p1 = new Product();
		Product p2 = new Product(1002,"pen",250,"31/dec");
		Product p3 = new Product(p2);
		
		System.out.println(p1.id+"  "+p1.name+"  "+p1.price+"  "+p1.mdate+"  "+p1.orgname);
		System.out.println(p2.id+"  "+p2.name+"  "+p2.price+"  "+p2.mdate+"  "+p2.orgname);
		System.out.println(p3.id+"  "+p3.name+"  "+p3.price+"  "+p3.mdate+"  "+p3.orgname);
	}
}
