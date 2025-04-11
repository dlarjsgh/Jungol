package j1031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int bingo = 0;
		int count = 0;
		int sign1 = 0;
		int[][] array = new int[5][5];
		for(int i=0; i<5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<5; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] bingoarray = new int[5][5];
		// [0] 0 1 2 3 4         [1] 0 1 2 3 4 [2] 0 1 2 3 4 [3] 01234 [4] 0 1234  
		// [01234] 0 [12345] 1 [12345] 2 [12345] 3 [12345] 4
		// [0][0]  [1][1]  [2][2] [3][3] [4][4] [0][4] [1][3] [2][2] [3][1] [4][4]

		for(int i=0; i<5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<5; j++) {
				bingoarray[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		//입력받는 값을 array에서 찾은 후 표시하기.
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				for(int p=0; p<5; p++) {
					for(int q=0; q<5; q++) {
						if(sign1==1) {
							break;
						}
						if(array[i][j] == bingoarray[p][q]) {
							array[i][j] = 0;
							count++;
							
							if(array[0][0]==0 && array[0][1]==0 &&array[0][2]==0 &&array[0][3]==0 && array[0][4]==0) {
								bingo++;
								if(bingo >= 3) {
									System.out.println(count);
									sign1 = 1;
									break;
								}
							}
							if(array[1][0]==0 && array[1][1]==0 &&array[1][2]==0 &&array[1][3]==0 && array[1][4]==0) {
								bingo++;
								if(bingo >= 3) {
									System.out.println(count);
									sign1 = 1;
									break;
								}
							}
							if(array[2][0]==0 && array[2][1]==0 &&array[2][2]==0 &&array[2][3]==0 && array[2][4]==0) {
								bingo++;
								if(bingo >= 3) {
									System.out.println(count);
									sign1 = 1;
									break;
								}
							}
							if(array[3][0]==0 && array[3][1]==0 &&array[3][2]==0 &&array[3][3]==0 && array[3][4]==0) {
								bingo++;
								if(bingo >= 3) {
									System.out.println(count);
									sign1 = 1;
									break;
								}
							}
							if(array[4][0]==0 && array[4][1]==0 &&array[4][2]==0 &&array[4][3]==0 && array[4][4]==0) {
								bingo++;
								if(bingo >= 3) {
									System.out.println(count);
									sign1 = 1;
									break;
								}
							}
							if(array[0][0]==0 && array[1][0]==0 &&array[2][0]==0 &&array[3][0]==0 && array[4][0]==0) {
								bingo++;
								if(bingo >= 3) {
									System.out.println(count);
									sign1 = 1;
									break;
								}
							}
							if(array[0][1]==0 && array[1][1]==0 &&array[2][1]==0 &&array[3][1]==0 && array[4][1]==0) {
								bingo++;
								if(bingo >= 3) {
									System.out.println(count);
									sign1 = 1;
									break;
								}
							}
							if(array[0][2]==0 && array[1][2]==0 &&array[2][2]==0 &&array[3][2]==0 && array[4][2]==0) {
								bingo++;
								if(bingo >= 3) {
									System.out.println(count);
									sign1 = 1;
									break;
								}
							}
							if(array[0][3]==0 && array[1][3]==0 &&array[2][3]==0 &&array[3][3]==0 && array[4][3]==0) {
								bingo++;
								if(bingo >= 3) {
									System.out.println(count);
									sign1 = 1;
									break;
								}
							}
							if(array[0][4]==0 && array[1][4]==0 &&array[2][4]==0 &&array[3][4]==0 && array[4][4]==0) {
								bingo++;
								if(bingo >= 3) {
									System.out.println(count);
									sign1 = 1;
									break;
								}
							}
							if(array[0][0]==0 && array[1][1]==0 &&array[2][2]==0 &&array[3][3]==0 && array[4][4]==0) {
								bingo++;
								if(bingo >= 3) {
									System.out.println(count);
									sign1 = 1;
									break;
								}
							}
							if(array[0][4]==0 && array[1][3]==0 &&array[2][2]==0 &&array[3][1]==0 && array[4][4]==0) {
								bingo++;
								if(bingo >= 3) {
									System.out.println(count);
									sign1 = 1;
									break;
								}
							}
							
							
							
						}
							
							
						
						
						
						
					}
				}
				
			}
		}
		
		
		
		
	}
}
