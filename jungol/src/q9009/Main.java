package q9009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String line;
		if((line = br.readLine()) != null && !line.isEmpty()) {
		st = new StringTokenizer(line);
		int a = Integer.parseInt(st.nextToken());
		String b = st.nextToken();
		
		System.out.printf("a = %d\n", a);
		System.out.printf("b = %s", b);
		}
	
	}
}

