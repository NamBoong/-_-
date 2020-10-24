package 수학2;

import java.util.Scanner;

public class Main1002 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();
		
		int[][] arr = new int[n][6];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<6; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			answer(arr[i][0], arr[i][1], arr[i][2], arr[i][3], arr[i][4], arr[i][5]);
		}
		
		scan.close();
	}
	
	public static void answer(int a, int b, int c, int d, int e, int f) {
		
		int dis = (int) (Math.pow(d-a, 2) + Math.pow(e-b, 2));
		
		if(d==a && e==b && f==c) {
			System.out.println(-1);
		}
		
		//내접 외접
		else if(dis==Math.pow(f-c, 2)) {
			System.out.println(1);
		}
		
		else if(dis==Math.pow(f+c, 2)) {
			System.out.println(1);
		}
		
		//도넛형
		else if(dis<Math.pow(f-c, 2)) {
			System.out.println(0);
		}
		
		else if(dis>Math.pow(f+c, 2)) {
			System.out.println(0);
		}
		
		else {
			System.out.println(2);
		}
	}

}
