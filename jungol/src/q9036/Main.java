package q9036;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[] = new int[5];
		
		
		for (int i=0; i<=4; i++) {
			array[i] = scan.nextInt();
		}
		
		for (int n : array) {
			System.out.print(n + " ");
		}
		scan.close();
	}
}
