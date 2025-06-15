package ExInheritance;

public class HierarchicalA extends Hierarchical{
	public int ha=300;
	public static void main(String args[])
	{
		HierarchicalA obj = new HierarchicalA();
		System.out.println("h : "+obj.h);
		System.out.println("ha : "+obj.ha);
	}
}