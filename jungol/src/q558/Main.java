package q558;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[] = new int[100];
		int index = 0;
		
		for (int i=0; i<array.length; i++) {

			int num = scan.nextInt();
			if(num == 0) {
			break;
			}
			array[index] = num;
			index++;
			}
			
		for(int r= index -1; r>=0; r--) {
			System.out.print(array[r]+ " ");
		
			
		}
		scan.close();
		
		
		
	}
}