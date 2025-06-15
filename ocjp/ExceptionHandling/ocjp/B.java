package ocjp;

//===> If the superclass method does not declare an exception,
//subclass overridden method cannot declare the checked exception 
// but it can declare unchecked exception.


//===> If the superclass method declares an exception,
//---> subclass overridden method can declare same,
//---> subclass exception or
//---> no exception but
//---> cannot declare parent exception.
public class B extends A{
	@Override
	public void test()
	{
		System.out.println("B--test()");
	}
	
	public static void main(String[] args) {
		B obj = new B();
		obj.test();
	}
}
