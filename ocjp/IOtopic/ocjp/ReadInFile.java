package ocjp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadInFile {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\yashp\\eclipse-workspace\\ocjp\\test1.txt");
			int temp;
			while((temp = fin.read()) != -1) 
			{
				sb.append((char)temp);
			}
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
		catch (IOException e) {
			e.printStackTrace();
		}	
		System.out.println(sb);

	}
}
