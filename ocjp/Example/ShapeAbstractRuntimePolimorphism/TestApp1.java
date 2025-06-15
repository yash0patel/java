package ShapeAbstractRuntimePolimorphism;
import java.util.Scanner;

public class TestApp1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		int choice=0;
		while(choice != 4)
		{
			System.out.println("Enter Below choice : ");
			System.out.println("1) For Circle");
			System.out.println("2) For Rectangle");
			System.out.println("3) For Triangle");
			System.out.println("4) For Exit");
			choice = sc.nextInt();
		
			Shape shape = null;
			switch(choice)
			{
			case 1:
				shape = new Circle(10);
				Circle circle = (Circle)shape;
				circle.calculateArea();
				break;
			case 2:
				shape = new Rectangle(10,20);
				Rectangle rectangle = (Rectangle)shape;
				rectangle.calculateArea();
				break;
			case 3:
				shape = new Triangle(20,10);
				Triangle triangle = (Triangle)shape;
				triangle.calculateArea();
				break;
			case 4:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalide choice...");
			}
		}
	}
}
