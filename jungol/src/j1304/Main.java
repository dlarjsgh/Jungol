package j1304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int[][] array = new int[a][a];
		int num = 1;
		
		StringBuilder sb = new StringBuilder();
		//array[0][0]에 1 그다음 array[1][0]에 1 즉 
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				array[j][i] = num++;
			}
		}
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				sb.append(array[i][j] + " ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}
