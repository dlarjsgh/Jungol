package q593;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int n = 33;
		
		while (n>=33 && n<=127) {
			System.out.print("ASCII code =? ");
			st =new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			char ascii = (char) n;
			if (n >= 33 & n<=127) {
			System.out.println(ascii);
			}
		}
	}
}
