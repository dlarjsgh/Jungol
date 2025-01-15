package b530;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int age = Integer.parseInt(br.readLine());
		
		if(age<20) {
			System.out.printf("%d years later", (20-age));
		}
		else if(age>=20)
			System.out.println("adult");
		
	}
}


