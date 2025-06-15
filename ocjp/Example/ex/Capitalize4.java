package ex;
import java.util.Scanner;

public class Capitalize4 {
	public static void Capitalizedstr(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				while (str.charAt(i) == ' ') {
					System.out.print(" " + Character.toUpperCase(str.charAt(i + 1)));
					i++;
				}
			} else if (i == 0) {
				System.out.print(Character.toUpperCase(str.charAt(i)));
			} else {
				System.out.print(str.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line of text.");
		String line = sc.nextLine();
		System.out.println();
		System.out.println("Capitalized version:");
		Capitalizedstr(line);
	}
}
