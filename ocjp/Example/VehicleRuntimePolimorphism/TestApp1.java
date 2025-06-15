package VehicleRuntimePolimorphism;
import java.util.Scanner;
public class TestApp1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Below choice : ");
		System.out.println("1) For Two Vehicle");
		System.out.println("2) For LMV Vehicle");
		System.out.println("3) For HMV Vehicle");
		int choice = sc.nextInt();
		
		Vehicle vehicle = null;
		switch(choice)
		{
			case 1:
					//Upcasting / Late Binding / Dynamic Binding / Runtime Polymorphism
					vehicle = new TwVehicle();
					vehicle.getSpace();
					
					//Downcasting ---> [Child reference = (Child reference)Parent reference]
					TwVehicle twVehicle = (TwVehicle)vehicle;
					twVehicle.getTwModelInfo();
					break;
			case 2:
					vehicle = new LmvVehicle();
					vehicle.getSpace();
					
					//Downcasting
					LmvVehicle lmvVehicle = (LmvVehicle)vehicle;
					lmvVehicle.getLmvModelInfo();
					break;
			case 3:
					vehicle = new HmvVehicle();
					vehicle.getSpace();
					
					//Downcasting
					HmvVehicle hmvVehicle = (HmvVehicle)vehicle;
					hmvVehicle.getHmvModelInfo();
					break;
			default:
					System.out.println("Invalide Choice");
		}
	}
	
}
