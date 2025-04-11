package j196;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Person {
	String name;
	String phonenumber;
	String address;
}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		
		person1.name = st1.nextToken();
		person1.phonenumber = st1.nextToken();
		person1.address = st1.nextToken();
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		person2.name = st2.nextToken();
		person2.phonenumber = st2.nextToken();
		person2.address = st2.nextToken();
		
		StringTokenizer st3 = new StringTokenizer(br.readLine());
		person3.name = st3.nextToken();
		person3.phonenumber = st3.nextToken();
		person3.address = st3.nextToken();

		String array[] = new String[3];
		array[0] = person1.name;
		array[1] = person2.name;
		array[2] = person3.name;
		
		Arrays.sort(array);
		
		if(array[0] == person1.name) {
			System.out.println("name : " + person1.name);
			System.out.println("tel : " + person1.phonenumber);
			System.out.println("addr : " + person1.address);
		}
		else if(array[0] == person2.name) {
			System.out.println("name : " + person2.name);
			System.out.println("tel : " + person2.phonenumber);
			System.out.println("addr : " + person2.address);
		}
		else {
			System.out.println("name : " + person3.name);
			System.out.println("tel : " + person3.phonenumber);
			System.out.println("addr : " + person3.address);
		}
	}
}
