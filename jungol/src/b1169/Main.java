package b1169;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		//이걸 n의 입력 즉 주사위의 수에 따라 증가하게 어떻게 해야될까?
		//n은 2~5   m은 1~3
		
		
		if(n == 2 && m == 1) {
			for(int i=1; i<=6; i++) {
				for(int j=1; j<=6; j++) {
					System.out.println(i + " " + j);
				}
			}
		}
		
		if(n == 3 && m == 1) {
			for(int i=1; i<=6; i++) {
				for(int j=1; j<=6; j++) {
					for(int k=1; k<=6; k++) {
						System.out.println(i + " " + j + " " + k);	
					}
				}
			}
		}
		
		
		if(n == 4 && m == 1) {
			for(int i=1; i<=6; i++) {
				for(int j=1; j<=6; j++) {
					for(int k=1; k<=6; k++) {
						for(int l=1; l<=6; l++) {
						System.out.println(i + " " + j + " " + k + " "+ l);
						}
					}
				}
			}
		}
		
		
		if(n == 5 && m == 1) {
			for(int i=1; i<=6; i++) {
				for(int j=1; j<=6; j++) {
					for(int k=1; k<=6; k++) {
						for(int l=1; l<=6; l++) {
							for(int p=1; p<=6; p++) {
								System.out.println(i + " " + j + " " + k + " "+ l+ " "+ p);
										
							}
						}
					}
				}
			}
		}
		
		
		if(n == 2 && m == 2) {
			for(int i=1; i<=6; i++) {
				for(int j=i; j<=6; j++) {
					System.out.println(i + " " + j);
				}
			}
		}
		
		
		
		if(n == 3 && m == 2) {
			for(int i=1; i<=6; i++) {
				for(int j=i; j<=6; j++) {
					for(int k=j; k<=6; k++) {
						System.out.println(i + " " + j + " " + k);	
					}
				}
			}
		}
		
		if(n == 4 && m == 2) {
			for(int i=1; i<=6; i++) {
				for(int j=i; j<=6; j++) {
					for(int k=j; k<=6; k++) {
						for(int l=k; l<=6; l++) {
						System.out.println(i + " " + j + " " + k + " "+ l);
						}
					}
				}
			}
		}
		
		
		if(n == 5 && m == 2) {
			for(int i=1; i<=6; i++) {
				for(int j=i; j<=6; j++) {
					for(int k=j; k<=6; k++) {
						for(int l=k; l<=6; l++) {
							for(int p=l; p<=6; p++) {
								System.out.println(i + " " + j + " " + k + " "+ l+ " "+ p);
										
							}
						}
					}
				}
			}
		}

		if(n == 2 && m == 3) {
			for(int i=1; i<=6; i++) {
				for(int j=1; j<=6; j++) {
					if(i!=j) {
						System.out.println(i + " " + j);
					}
				}
			}
		}
		
		if(n == 3 && m == 3) {
			for(int i=1; i<=6; i++) {
				for(int j=1; j<=6; j++) {
					for(int k=1; k<=6; k++) {
						if(k!=j && k!=i && j!=i) {
						System.out.println(i + " " + j + " " + k);	
						}
					}
				}
			}
		}
		
		
		if(n == 4 && m == 3) {
			for(int i=1; i<=6; i++) {
				for(int j=1; j<=6; j++) {
					for(int k=1; k<=6; k++) {
						for(int l=1; l<=6; l++) {
							if(l!=k && l!=j && l!=i && k!=j && k!=i && j!=i) {
						System.out.println(i + " " + j + " " + k + " "+ l);
							}
						}
					}
				}
			}
		}
		
		
		if(n == 5 && m == 3) {
			for(int i=1; i<=6; i++) {
				for(int j=1; j<=6; j++) {
					for(int k=1; k<=6; k++) {
						for(int l=1; l<=6; l++) {
							for(int p=1; p<=6; p++) {
								if(p!=l && p!=k && p!=j && p!=i && l!=k && l!=j && l!=i && k!=j && k!=i && j!=i)
								System.out.println(i + " " + j + " " + k + " "+ l+ " "+ p);
										
							}
						}
					}
				}
			}
		}
		
	}
}
