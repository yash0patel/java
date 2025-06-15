package Immutable;

public class StringConstantPool {
	public static void main(String[] args) 
	{
	    // 1) By String literals [HEAP--"SCP"]:
			//String constant pool
		String name1 = "royal";
		String name2 = "royal";
		String name3 = "techno";
		String name4 = name1 + name3;
		
		System.out.println("name1 == name2: " + (name1 == name2)); // true
	    System.out.println("name1 == name3: " + (name1 == name3)); // false
	    System.out.println("name1 == name4: " + (name1 == name4)); // false

	    System.out.println("name1.equals(name2): " + (name1.equals(name2))); // true
	    System.out.println("name1.equals(name3): " + (name1.equals(name3))); // false
	    System.out.println("name1.equals(name4): " + (name1.equals(name4))); // false

	    // 2) By new keyword
	    String name5 = new String("yash");
	    String name6 = new String("yash");
	    String name7 = new String("sagar");

	    System.out.println("name5 == name6: " + (name5 == name6)); // false
	    System.out.println("name5 == name7: " + (name5 == name7)); // false
	    System.out.println("name5.equals(name6): " + (name5.equals(name6))); // true
	}
}
