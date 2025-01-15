package b616;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Triangle {
	int x;
	int y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	
}


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		Triangle t3 = new Triangle();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		t1.x = Integer.parseInt(st.nextToken());
		t1.y = Integer.parseInt(st.nextToken());
		t2.x = Integer.parseInt(st.nextToken());
		t2.y = Integer.parseInt(st.nextToken());
		t3.x = Integer.parseInt(st.nextToken());
		t3.y = Integer.parseInt(st.nextToken());
		
		double xweight = (double)(t1.x+t2.x+t3.x)/3;
		double yweight = (double)(t1.y+t2.y+t3.y)/3;
		
		
		System.out.printf("(%.1f, %.1f)", xweight, yweight);
		
	}
}


