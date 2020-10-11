package for¹®;

import java.util.Scanner;

public class Main11022 {

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
			System.out.println("Case #" + (i+1) + ": " + arr[i][0] + " + " + arr[i][1] + " = " + (arr[i][0]+arr[i][1]));
		}
		
		scan.close();
	}

}
