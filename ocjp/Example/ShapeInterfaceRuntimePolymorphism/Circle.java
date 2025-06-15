package ShapeInterfaceRuntimePolymorphism;

public class Circle implements Shape {
	double radius;
	Circle(double radius) 
	{
        this.radius=radius;
    }
	public void calculateArea() {
		System.out.println("Area of Circle: "+(Math.PI * radius * radius)); 
    }
}
