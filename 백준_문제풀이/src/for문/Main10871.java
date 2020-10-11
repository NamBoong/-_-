package for¹®;

import java.util.Scanner;

public class Main10871 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int n = scan.nextInt();
		
		int[] arr = new int[x];
		
		for(int i=0; i<x; i++) {
			arr[i] = scan.nextInt();
			
			if(arr[i]<n) {
				System.out.printf(arr[i] + " ");
			}
		}
		
		scan.close();
	}

}
