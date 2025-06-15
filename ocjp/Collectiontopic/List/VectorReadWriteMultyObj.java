package List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Vector;
public class VectorReadWriteMultyObj {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(new EmpObj(1,"yash",2000,"xyz"));
		v.add(new EmpObj(2,"jay",3000,"xyz"));
		v.add(new EmpObj(3,"vrund",4000,"xyz"));
		
		try {
			FileOutputStream fout = new FileOutputStream("vectorex.text");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			Iterator itr = v.iterator();
			while(itr.hasNext())
			{
				Object obj = itr.next();
				out.writeObject(obj);
			}
			out.close();
			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\yashp\\eclipse-workspace\\ocjp\\vectorex.text");
			ObjectInputStream in = new ObjectInputStream(fin);
			
			Object obj1;;
			while ((obj1 = in.readObject()) != null) {
                System.out.println(obj1.toString());
            }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
