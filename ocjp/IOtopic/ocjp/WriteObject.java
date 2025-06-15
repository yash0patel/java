package ocjp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void main(String[] args) {
		StudentGetSet s1 = new StudentGetSet(1,"yash",12);
		
		try 
		{
			FileOutputStream fout = new FileOutputStream("objwrite1.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(s1);
			
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
