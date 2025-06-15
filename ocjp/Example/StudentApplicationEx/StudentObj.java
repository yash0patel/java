package StudentApplicationEx;

import java.util.Comparator;
import java.util.Scanner;

public class StudentObj implements Comparable<StudentObj>{
	private int rno;
	private String name;
	private int std;
	private int marks;
	
	public StudentObj() 
	{
	}
	public StudentObj(int rno, String name, int std, int marks) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}
	public void disp() 
	{
		System.out.println(rno +" " + name+" " + std +" " + marks);
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void scan()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Following Student details : ");
		System.out.print("Roll number : ");
		rno = sc.nextInt();
		System.out.print("Name : ");
		name = sc.nextLine();
		sc.nextLine();
		System.out.print("Std : ");
		std = sc.nextInt();
		System.out.print("Marks : ");
		marks = sc.nextInt();
		System.out.println("Student Details scanned successfully");
	}
	
	public void update(int x)
	{
		Scanner sc = new Scanner(System.in);
		if(x == 1 || x == 5)
		{
			System.out.print("Enter New Roll Number : ");
			rno = sc.nextInt();
		}
		if(x == 2 || x == 5)
		{
			System.out.print("Enter New Name : ");
			name = sc.nextLine();
		}
		if(x == 3 || x == 5)
		{
			System.out.print("Enter New Std : ");
			std = sc.nextInt();
		}
		if(x == 4 || x == 5)
		{
			System.out.print("Enter New Marks : ");
			marks = sc.nextInt();
		}
		System.out.println("Data updated successfully");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rno + " " + name + " " + std + " " + marks;
	}
	@Override
	public int compareTo(StudentObj o) {
		// TODO Auto-generated method stub
		return 0;
	}
}


//********************
//Student Application
//********************
//1) Add student....
//2) update Student
//		1) By Name
//		2) By Std
//		3) By Marks
//3) delete student
//		1) By Name
//		2) By Std
//		3) By Marks
//4) search record by
//	1)
//	2)
//	3)
//5) sorting
//	1) Ascending Order
//		1) By Name
//		2) By Std
//		3) By Marks
//	2) Descending Order
//		1) By Name
//		2) By Std
//		3) By Marks
//6) exit
