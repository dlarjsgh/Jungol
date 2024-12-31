package q9066;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String array[] = new String[26];
			
			for(int i=0; i<array.length; i++) {
				array[i] = scan.next();
			}
			System.out.println(array.length);
			for(int y=array.length-1; y>=0; y--) {
				System.out.print(array[y]+ " ");
			}
	}
}
