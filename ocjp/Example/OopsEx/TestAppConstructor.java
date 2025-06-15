package OopsEx;

public class TestAppConstructor {
	public static void main(String args[]) {
		Constructor c = new Constructor();
		c.disp();

		Constructor c1 = new Constructor(5);
		c1.disp();

		Constructor c2 = new Constructor("abc");
		c2.disp();

		Constructor c3 = new Constructor(10, "xyz");
		c3.disp();

		Constructor c4 = new Constructor("pqr", 15);
		c4.disp();
	}
}
