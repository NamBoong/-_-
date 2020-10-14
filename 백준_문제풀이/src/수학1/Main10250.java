package ¼öÇÐ1;

import java.util.Scanner;

public class Main10250 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] arr = new int[n][3];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int count = 1;
		int test = 0;
		
		while(test<n) {
			for(int j=1; j<=arr[test][1]; j++) {
				for(int i=1; i<=arr[test][0]; i++) {
					if(count==arr[test][2]) {
						System.out.format(i + "%02d\n", j);
					}
					count++;
				}
			}
			count = 1;
			test++;
		}
		
		scan.close();
	}

}
