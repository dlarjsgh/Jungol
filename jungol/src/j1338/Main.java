package j1338;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		char[][] array = new char[n][n];
		int number = 65;
		
		for(int i=0; i<n; i++) {
			
			for(int j=i; j<n; j++) {
				array[i][j] = ' ';
			}
			
		}
		
		for(int i=1; i<n+1; i++) {
			for(int j=n-i; j>=0; j--) {
				array[j][j+i-1] = (char)number;
				number++;
				if(number>'Z') {
					number = 'A';
				}
	}
		}
		
				
				
		for(int i=n-1; i>=0; i--) {
			for(int j=0; j<n; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
