package q1856;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());		
		int m = Integer.parseInt(st.nextToken());
		
		
		
		for(int i=1; i<=n; i++) {
			
			if(i%2 == 1) { //홀수줄일때
				for(int j=m*(i-1)+1; j<=m*i; j++) {
					System.out.print(j+ " ");
				}
			}
			else if(i%2 == 0) { //짝수줄일때
				for(int p=m*i; p>=m*(i-1)+1; p--) {
					System.out.print(p+ " ");
				}
			}
			System.out.println();
			}
			
	
		
	}
}