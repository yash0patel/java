package ocjp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectInFIle {
	public static void main(String[] args) {
		try 
		{
					FileInputStream fin = new FileInputStream("C:\\Users\\yashp\\eclipse-workspace\\ocjp\\objwrite1.txt");
					ObjectInputStream oin = new ObjectInputStream(fin);
					
					StudentGetSet s = (StudentGetSet)oin.readObject();
					System.out.println(s.getRno() + " " + s.getName() + " " + s.getStd());
					oin.close();
					fin.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}	
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}	
		
	}
}
