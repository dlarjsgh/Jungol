package q111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sum = 0;
		
		for(int i=0; i<4; i++) {
			int a = Integer.parseInt(st.nextToken());
			sum += a;
		}
		System.out.println("sum "+ sum);
		System.out.println("avg "+ (int) sum/4);
		
	}
}


