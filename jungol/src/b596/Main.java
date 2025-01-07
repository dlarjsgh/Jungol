package b596;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		String s = st.nextToken();
		int a = Integer.parseInt(st.nextToken());
		
		if(a>s.length()) {
			System.out.println(new StringBuilder(s).reverse().toString());
		}
		else {
			for(int i=s.length(); i>s.length()-a; i--) { 
				System.out.print(s.charAt(i-1));
			}
		}
		
	}
}
