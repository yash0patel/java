package ocjp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteInFile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name = sc.nextLine();
		
		//data--String--write(byte)
		byte b[] = name.getBytes();
		
		try {
					FileOutputStream fout = new FileOutputStream("test1.txt");
					fout.write(b);
					fout.close();
					System.out.println("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
