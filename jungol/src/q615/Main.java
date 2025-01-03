package q615;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Student{
	String name;
	int kscore;
	int mscore;
}
	
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		st = new StringTokenizer(br.readLine());
		student1.name = st.nextToken();
		student1.kscore = Integer.parseInt(st.nextToken());
		student1.mscore = Integer.parseInt(st.nextToken());
		sb.append(student1.name).append(" ").append(student1.kscore).append(" ").append(student1.mscore).append("\n");
		
		st = new StringTokenizer(br.readLine());
		student2.name = st.nextToken();
		student2.kscore = Integer.parseInt(st.nextToken());
		student2.mscore = Integer.parseInt(st.nextToken());
		sb.append(student2.name).append(" ").append(student2.kscore).append(" ").append(student2.mscore).append("\n");

		int avgk = (student1.kscore + student2.kscore)/2;
		int avgm = (student1.mscore + student2.mscore)/2;
		
		sb.append("avg ").append(avgk).append(" ").append(avgm);
		
		System.out.println(sb);
		}
	}