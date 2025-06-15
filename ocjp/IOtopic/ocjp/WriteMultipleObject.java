package ocjp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteMultipleObject {
	public static void main(String[] args) {
		EmpObj e1 = new EmpObj(101,"yash",999999,"xyz");
		EmpObj e2 = new EmpObj(102,"john",999999,"abc");
		EmpObj e3 = new EmpObj(103,"het",999999,"pqr");
		
		try 
		{
			FileOutputStream fout = new FileOutputStream("EmpDetails.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(e1);
			out.writeObject(e2);
			out.writeObject(e3);

			
			out.close();
			fout.close();
			System.out.println("Done");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}	
		catch (IOException e) 
		{
			e.printStackTrace();
		}	
	}
}
