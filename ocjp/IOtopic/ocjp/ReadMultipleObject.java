package ocjp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadMultipleObject {
	public static void main(String[] args) {
		try 
		{
					FileInputStream fin = new FileInputStream("C:\\Users\\yashp\\eclipse-workspace\\ocjp\\EmpDetails.txt");
					ObjectInputStream oin = new ObjectInputStream(fin);
					
					EmpObj e1 = (EmpObj)oin.readObject();
					EmpObj e2 = (EmpObj)oin.readObject();
					EmpObj e3 = (EmpObj)oin.readObject();

					System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getSalary() + " " + e1.getOrgname());
					System.out.println(e2.getId() + " " + e2.getName() + " " + e2.getSalary() + " " + e2.getOrgname());
					System.out.println(e3.getId() + " " + e3.getName() + " " + e3.getSalary() + " " + e3.getOrgname());

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