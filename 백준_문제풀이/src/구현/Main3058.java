package ±¸Çö;

import java.util.Scanner;

public class Main3058 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] arr = new int[n][7];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<7; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int count = 0;
		int sum = 0;
		int min = 150;
		
		while(count<n) {
			for(int j=0; j<7; j++) {
				if(arr[count][j]%2==0) {
					sum = sum + arr[count][j];
					if(min>arr[count][j]) {
						min = arr[count][j];
					}
				}
			}
			
			System.out.println(sum + " " + min);
			sum = 0;
			min = 150;
			count++;
		}
		
		scan.close();
	}

}
