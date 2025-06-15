package ShapeInterfaceRuntimePolymorphism;

public class Rectangle implements Shape {
    double length;
    double width;

    Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
    	System.out.println("Area of Rectangle: "+ (length * width));
    }
}