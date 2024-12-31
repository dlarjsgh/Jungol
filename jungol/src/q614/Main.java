package q614;

import java.util.Scanner;

class School{
	String SchoolName;
	int Grade;
	
	public School(String SchoolName, int Grade) {
		this.SchoolName = SchoolName;
		this.Grade = Grade;
	}
}



public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String SchoolName = "Jejuelementary";
		int Grade = 6;
		System.out.printf("%d grade in %s School\n", Grade, SchoolName);
		
		SchoolName = scan.next();
		Grade = scan.nextInt();
		
		School school = new School(SchoolName, Grade);
		System.out.printf("%d grade in %s School", Grade, SchoolName);
	}

}
