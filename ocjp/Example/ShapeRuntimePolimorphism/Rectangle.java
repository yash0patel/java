package ShapeRuntimePolimorphism;

public class Rectangle extends Shape {
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