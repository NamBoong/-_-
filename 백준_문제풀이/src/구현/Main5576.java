package ±¸Çö;

import java.util.Scanner;

public class Main5576 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[20];
		
		for(int i=0; i<20; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<10; i++) {
			for(int j=i+1; j<10; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		for(int i=10; i<20; i++) {
			for(int j=i+1; j<20; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.printf((arr[0]+arr[1]+arr[2]) + " "  + (arr[10]+arr[11]+arr[12]));
		
		scan.close();
	}
}
