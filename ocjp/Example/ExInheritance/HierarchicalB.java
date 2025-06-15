package ExInheritance;

public class HierarchicalB extends Hierarchical{
	public int hb=200;
	public static void main(String args[])
	{
		HierarchicalB obj = new HierarchicalB();
		System.out.println("h : "+obj.h);
		System.out.println("hb : "+obj.hb);
	}
}