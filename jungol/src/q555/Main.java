package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String array[] = new String[10];
		
		for(int i=0; i<array.length; i++) {
			array[i] = scan.next();
			}
		for(String r : array) {
			System.out.print(r);
		}
		scan.close();
	}

}
