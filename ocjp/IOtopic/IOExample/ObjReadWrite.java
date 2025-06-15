package IOExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjReadWrite {
	public static void main(String[] args) {
		EmpObj e1 = new EmpObj(101,"yash",950000,"royal","dsgn1");
		EmpObj e2 = new EmpObj(102,"john",880000,"xyz","dsgn2");
		EmpObj e3 = new EmpObj(103,"emp3",990000,"royal","dsgn3");
		EmpObj e4 = new EmpObj(104,"emp4",160000,"royal","dsgn4");
		EmpObj e5 = new EmpObj(105,"emp5",500000,"abc","dsgn5");
		EmpObj e6 = new EmpObj(106,"emp6",600000,"pqr","dsgn6");
		EmpObj e7 = new EmpObj(103,"emp7",390000,"royal","dsgn7");
		EmpObj e8 = new EmpObj(104,"emp8",260000,"royal","dsgn8");
		EmpObj e9 = new EmpObj(105,"emp9",400000,"abc","dsgn9");
		EmpObj e10 = new EmpObj(106,"emp10",700000,"xyz","dsgn10");
		
		try 
		{
			FileOutputStream fout = new FileOutputStream("EmpDetails1.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(e1);
			out.writeObject(e2);
			out.writeObject(e3);
			out.writeObject(e4);
			out.writeObject(e5);
			out.writeObject(e6);
			out.writeObject(e7);
			out.writeObject(e8);
			out.writeObject(e9);
			out.writeObject(e10);			

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
		
		
		try {
			FileInputStream fin = new FileInputStream("EmpDetails1.txt");
			ObjectInputStream oin = new ObjectInputStream(fin);
			for(int i = 0; i < 10 ; i++)
			{
				EmpObj r = (EmpObj)oin.readObject();
				System.out.println(r.getId() + "  " + r.getName() + "  " + r.getSalary() + "  " + r.getOrgname());
			}
			oin.close();
			fin.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}	
		catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
