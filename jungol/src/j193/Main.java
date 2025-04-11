package j193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		//5개의 문자를 입력받고 그 이후에 입력받은 문자 1개와  문자열 1개를 입력받고 포함된 단어를 모두 출력하는 프로그램을 작성
		//찾는 단어가 없다면 none 출력
		
		String[] array = new String[5];
		
		for(int i=0; i<5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			array[i] = st.nextToken();
		}
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		String s1 = st1.nextToken();
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		String s2 = st2.nextToken();
		//문자열 혹은 문자를 입력받았다.. 이걸 array 안에 들어있는 문자열과 비교하는 방법은?
		
		
		for(int i=0; i<5; i++) {
			if(array[i].contains(s1) || array[i].contains(s2)) {
				sb.append(array[i]).append("\n");
			}
		}
		
		if(sb.length() ==0 ) {
			System.out.println("none");
		}
		
		System.out.println(sb);
		
	}
}
