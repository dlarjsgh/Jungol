package q560;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] array = new int[10];
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<10; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			if(array[i]<min) {
				min = array[i];
			}
		}
		
		System.out.println(min);
		
	}
}
