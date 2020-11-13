package 브루트포스;

import java.util.Scanner;

public class Main3040 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = scan.nextInt();
			sum = sum + arr[i];
		}
		
		int a = 0;
		int b = 0;
		
		for(int i=0; i<9; i++) {
			for(int j=i+1; j<9; j++) {
				if(sum-arr[i]-arr[j]==100) {
					a = arr[i];
					b = arr[j];
				}
			}
		}
		
		for(int i=0; i<9; i++) {
			if(arr[i]!=a) {
				if(arr[i]!=b) {
					System.out.println(arr[i]);
				}
			}
		}
		
		scan.close();
	}

}
