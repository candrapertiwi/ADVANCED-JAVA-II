package lecture12;
import java.util.*;
import java.sql.*;

public class main {
	public static Scanner scan;
	public static StudentDA sda;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		sda = new StudentDA();
		int choice;
	do {	
		System.out.println("1. Enter Student");
		System.out.println("2. Find Student");
		System.out.println("0. Exit");
		System.out.print("Enter your Choice: ");
		choice = scan.nextInt();
		scan.hasNextLine();
		scan.nextLine();
		switch(choice) {
		case 1: EnterStudent();break;
		case 2: FindStudent();break;
		default: System.out.println("Invalid option!");
		}
	}
	while(choice!=0);
	}
	
	public static void EnterStudent() {
		System.out.print("Enter Student ID : ");
		String StudentID = scan.nextLine();
		System.out.print("Enter Student Name : ");
		String name = scan.nextLine();
		System.out.print("Enter Score : ");
		double score = scan.nextDouble();
		scan.hasNextLine();
		
		Student s = new Student(StudentID,name,score);
		sda = new StudentDA();
		if (sda.Save(s)) 
			System.out.println("Saved Student Data!");
		
	}
	
	public static void FindStudent() {
		System.out.print("Enter ID to search : ");
		String StudentID = scan.nextLine();
		Student s = sda.getStudent(StudentID);
		if(s==null) {
			System.out.println("No student found!");
		}
		else {
			System.out.println(s.getName()+"Score is " + s.getScore());
		}
	}
}	
