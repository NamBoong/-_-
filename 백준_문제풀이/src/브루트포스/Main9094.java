package 브루트포스;

import java.util.Scanner;

public class Main9094 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] arr = new int[n][2];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(answer(arr[i][0], arr[i][1]));
		}
		
		scan.close();
	}
	
	public static int answer(int n, int m) {
		
		int a = 0;
		int b = 0;
		
		int count = 0;
		
		for(int i=1; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				a = i;
				b = j;
				
				if((Math.pow(a, 2)+Math.pow(b, 2)+m)%(a*b)==0) {
					count++;
				}
			}
		}
		
		return count;
	}

}
