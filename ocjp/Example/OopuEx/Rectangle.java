package OopuEx;

public class Rectangle {
//	3. Write a Java program to create a class called "Rectangle" with 
//	width and height attributes. Calculate the area and perimeter of the rectangle
	int width;
	int height;
	
	Rectangle(int w,int h)
	{
		this.height = h;
		this.width = w;
	}
	
	public int area()
	{
		return width*height;
	}
	
	public int perimeter()
	{
		return 2*(width+height);
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(5,5);
		
		System.out.println("area : "+r.area());
		System.out.println("perimeter : "+r.perimeter());
	}
}
