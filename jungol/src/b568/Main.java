package b568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int[][] array1 = new int[2][4];
		int[][] array2 = new int[2][4];
		
		
		System.out.println("first array");
		for(int i=0; i<2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<4; j++) {
				array1[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		

		System.out.println("second array");
		for(int i=0; i<2; i++) {

			StringTokenizer a = new StringTokenizer(br.readLine());
			for(int j=0; j<4; j++) {
				array2[i][j] = array1[i][j] * Integer.parseInt(a.nextToken());
				sb.append(array2[i][j]+" ");
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
		
	}
}


