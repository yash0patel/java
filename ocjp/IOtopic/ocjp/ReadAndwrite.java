package ocjp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndwrite {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name = sc.nextLine();
		
		//data--String--write(byte)
		byte b[] = name.getBytes();
		
		try {
					FileOutputStream fout = new FileOutputStream("test2.txt");
					FileInputStream fin = new FileInputStream("test1.txt");
					fout.write(b);
					fout.close();
					StringBuilder test1 = new StringBuilder();
					int temp;
					while ((temp = fin.read()) != -1) {
						test1.append((char)temp);
					}
					fin.close();
					System.out.println("test1 : " + test1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
