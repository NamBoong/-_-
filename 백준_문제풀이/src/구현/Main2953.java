package ±¸Çö;

import java.util.Scanner;

public class Main2953 {

	static Scanner scan = new Scanner(System.in);
	static int sum = 0;
	static int answer = 0;
	
	public static void main(String[] args) {

		int[][] arr = new int[5][4];
		
		int count=0;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int[] best = new int[5];
		
		while(count<5) {		
			for(int i=0; i<4; i++) {
				answer(arr[count][i]);
				best[count] = best[count] + arr[count][i];
			}
			sum = 0;
			count++;
		}
		
		count = 0;
		
		while(count<5) {
			if(best[count]==answer) {
				System.out.println(count+1 +  " " + answer);
			}
			count++;
		}
		scan.close();
	}
	
	public static void answer(int a) {
		
		sum = sum + a;
		
		if(answer<sum) {
			answer = sum;
		}
	}

}
