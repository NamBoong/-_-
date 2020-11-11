package 브루트포스;

import java.util.Scanner;

public class Main2309 { 
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = scan.nextInt();
			sum = sum + arr[i];
		}
		
		for(int i=0; i<9; i++) {
			for(int j=i+1; j<9; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int a = -1;
		int b = -1;
		
		for(int i=0; i<9; i++) {
			for(int j=i+1; j<9; j++) {
				if(sum-arr[i]-arr[j]==100) {
					a = i;
					b = j;
				}
			}
		}
		
		for(int i=0; i<9; i++) {
			if(i!=a) {
				if(i!=b) {
					System.out.println(arr[i]);
				}
			}
		}
		scan.close();
	}

}
