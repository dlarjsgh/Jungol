package j599;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		
		for(int i=0; i<s.length(); i++) {
			if((s.charAt(i)>=65 && s.charAt(i)<90) || (s.charAt(i)>=97 && s.charAt(i)<122)) {
				sb.append(s.toUpperCase().charAt(i));
			}
		}
		System.out.println(sb);
		
	}
}
