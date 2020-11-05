package 구현;

import java.util.Scanner;

public class Main14645 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		@SuppressWarnings("unused")
		int b = scan.nextInt();
		
		int[][] arr = new int[a][2];

			for(int i=0; i<a; i++) {
				for(int j=0; j<2; j++) {
					arr[i][j] = scan.nextInt();
				}
			}		
		
		System.out.println("비와이");
		
		scan.close();
	}

}
