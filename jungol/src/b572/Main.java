package b572;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		r(a);
		
		
		


		
	}

    static public void r(int p){
        System.out.printf("%.2f", (double) p*p*3.14);
    }
}


