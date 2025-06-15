package ShapeRuntimePolimorphism;

public class Triangle extends Shape{
    double base;
    double height;

    Triangle(double base, double height) 
    {
        this.base = base;
        this.height = height;
    }

    public void calculateArea() 
    {
    	System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}
