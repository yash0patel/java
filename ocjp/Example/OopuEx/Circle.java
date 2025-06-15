package OopuEx;
import java.lang.Math;
public class Circle {
//	4. Write a Java program to create a class called "Circle" with a radius attribute. 
//	You can access and modify this attribute. Calculate the area and circumference of the circle.
	double radius;
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	public double area()
	{
		return Math.PI*(radius*radius);
	}
	
	public double circumference()
	{
		return 2*Math.PI*radius;
	}
	
	public static void main(String[] args) {
		Circle c = new Circle(5);
		
		System.out.println("area : "+c.area());
		System.out.println("circumference : "+c.circumference());
	}
}
