package AbstractEx;

public class Circle extends Shape{
	double radius;
	public Circle(double radius) 
	{
        this.radius = radius;
    }
	public void calculateArea() {
        System.out.println("Area of Circle : "+(Math.PI * radius * radius));
    }
}
