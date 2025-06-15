package IOExample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Read a file and write only palindrome words from that file into another file...
public class Ex1 {
	public static void main(String[] args) {
		//write into file
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		
		try 
		{
			FileWriter fw = new FileWriter("test3.txt");
			fw.write(str+'\n');
			fw.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}	
		
		//read from file
		StringBuilder sb = new StringBuilder();
		try {
			FileReader fr = new FileReader("test3.txt");
			int temp;
			while((temp = fr.read()) != -1) 
			{
				if((char)temp == ' ' || (char)temp ==  '\n')
				{
					String word = sb.toString();
					if(word.equals(sb.reverse().toString()))
					{
						System.out.print(sb + " ");
					}
					sb = new StringBuilder();
				}
				else
				{
					sb.append((char)temp);					
				}
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
		catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
