package Interface;

public interface Vehicle {
//	1)Dm's --> constant --> [public static final]
	public static final int NO = 10;
	int NO2 = 20;
 	
//	2)Mf's 
	//--> abstract method	
	void getSpace(); // public abstract void getSpace();
 	
	//--> Non abstract method	
	//1)static method
	static void test2() 
	{}
	
	//2)default method --> child object --> default call
	default void test3()
	{
		test4();
	}
	
	//3)private method
	private void test4()
	{}
}
