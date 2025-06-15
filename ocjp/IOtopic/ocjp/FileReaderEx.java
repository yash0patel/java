package ocjp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		try {
			FileReader fr = new FileReader("test3.txt");
			int temp;
			while((temp = fr.read()) != -1) 
			{
				sb.append((char)temp);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
		catch (IOException e) {
			e.printStackTrace();
		}	
		System.out.println("test3 : " + sb);
	}
}
