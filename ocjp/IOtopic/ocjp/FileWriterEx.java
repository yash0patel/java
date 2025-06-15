package ocjp;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		
		try 
		{
			FileWriter fw = new FileWriter("test3.txt");
			fw.write(str);
			fw.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}	
	}
}
