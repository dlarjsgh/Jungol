package q613;

import java.util.Scanner;

class Student {
	String name;
	String school;
	int grade;
}

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		student.name = scan.next();
		student.school = scan.next();
		student.grade = scan.nextInt();
		
		System.out.println("Name : " + student.name);
		System.out.println("School : " + student.school);
		System.out.println("Grade : " + student.grade);
		scan.close();
		
		
		
	}
}