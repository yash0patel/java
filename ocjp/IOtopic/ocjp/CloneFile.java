package ocjp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CloneFile {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("test3.txt");
			FileWriter fw = new FileWriter("test4.txt");
			int temp;
			while((temp = fr.read()) != -1) 
			{
				fw.write((char)temp);
			}
			fr.close();
			fw.close();
			
			FileReader fr2 = new FileReader("test4.txt");
			StringBuilder sb = new StringBuilder();
			while((temp = fr2.read()) != -1) 
			{
				sb.append((char)temp);
			}
			fr2.close();
			System.out.println("Clone File :\n" + sb);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
		catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
