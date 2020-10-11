package for¹®;

import java.util.Scanner;

public class Main10950 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		int[][] arr = new int[a][2];
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<a; i++) {
			System.out.println((arr[i][0]+arr[i][1]));
		}
		
		scan.close();
	}

}
