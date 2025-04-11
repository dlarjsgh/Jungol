package j564;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//A는 65 Z는 90
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] array = new String[100];
		ArrayList<String> arraylist = new ArrayList<>();
		boolean[] b = new boolean[26];
		
		for(int i=0; i<26; i++) {
			b[i] = false;
		}
		
		for(int i=0; i<100; i++) {
			array[i] = st.nextToken();
			
			if(array[i].charAt(0)<65 | array[i].charAt(0)>90){
				break;	
			}
			else {
				arraylist.add(array[i]);
			}
			
		}
		Collections.sort(arraylist);
		
			
		for(String s:arraylist) {
			System.out.println(s);
		}
		
		
		
		
	
		//영어 대문자를 입력받는다. 영어 대문자 이외를 입력받으면 중단한다. charAt(0)이 65~90 사이가 아니면
		//영어 대문자들에 대해 각 문자가 입력된 횟수와 문자의 개수를 사전 순으로 출력하라.
		//입력되는 수의 개수는 2~100 사이이다.
		
		//입력을 받는데.. 그냥 입력을 받는건 array[100] 선언하고 array[i] = st.nextToken()하면됨 입력받는 array를 따로설정?
		/* for(int i=0; i<100; i++) {
		array[i] = st.nextToken();
		
		if(array[i].charAt(0)
		}
		
	
		
		
		
		
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
	}
}


