package q565;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		//0~99 양수들이 주어진다. 입력받다가 0이 주어지면 마지막에 입력된 0은 제외
		
		
		//그때까지 입력된 정수의 십의 자리 숫자가 각각 몇 개인지 출력
		
		
		//일단 모든 십의 자리만 카운트 하고 0인건 빼고 출력 
		ArrayList<Integer> arraylist = new ArrayList<>();
		
		while(true) {
			int a = Integer.parseInt(st.nextToken());
			if(a==0) {
				break;
			}
			else if(a>=1 && a<=99){
				arraylist.add(a/10);
			}
		}

		int[] array = new int[10];
		
		for(int i=0; i<arraylist.size(); i++) {
			array[arraylist.get(i)]++;
		}
		
		for(int i=0; i<10; i++) {
			if(array[i]!=0) {
			System.out.println(i + " : "+ array[i]);
			}
		}
		
	}
}


