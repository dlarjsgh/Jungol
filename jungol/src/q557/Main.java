package q557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String array[] = new String[10];
		
		for(int i=0; i<array.length; i++) {
			array[i] = scan.next();
			}

            System.out.print(array[0] + " " + array[3] + " " + array[6]);
		scan.close();
	}

}