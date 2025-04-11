package b2259;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine());
		int sum =0;
		int maxwidth =0;
		int maxheight = 0;
		int minus = 0;
		
		int[] array = new int[14];
		for(int i=0; i<12; i=i+2) { //0,2,4,6,8,10,12
			StringTokenizer st = new StringTokenizer(br.readLine());
			array[i] = Integer.parseInt(st.nextToken());
			array[i+1] = Integer.parseInt(st.nextToken());
		}
		
		array[12] = array[0];
		array[13] = array[1];
		
		for(int i=0; i<12; i=i+2) { //0 2 2 4 4 6 6 8 8 10 
		if(array[i] == 3 && maxheight < array[i+1]) {
			maxheight = array[i+1];
		}
		else if(array[i] == 4 && maxheight < array[i+1]) {
			maxheight = array[i+1];
		}
		else if(array[i] == 1 && maxwidth < array[i+1]) {
			maxwidth = array[i+1];
		}
		else if(array[i]==2 && maxwidth < array[i+1]) {
			maxwidth = array[i+1];
		}
		
	}
		
		for(int i=0; i<12; i=i+2) {
			if(array[i] == 1 && array[i+2] == 3) { //0 2 2 4 4 6 6 8 8 10
				minus = array[i+1] * array[i+3];
			}
			if(array[i] == 4 && array[i+2] == 1) { //0 2 2 4 4 6 6 8 8 10
				minus = array[i+1] * array[i+3];
			}
			if(array[i] == 2 && array[i+2] == 4) { //0 2 2 4 4 6 6 8 8 10
				minus = array[i+1] * array[i+3];
			}
			if(array[i] == 3 && array[i+2] == 2) { //0 2 2 4 4 6 6 8 8 10
				minus = array[i+1] * array[i+3];
			}
		}
		
		
		sum = maxheight*maxwidth - minus;
		System.out.println(sum*s);

		
	}
}
