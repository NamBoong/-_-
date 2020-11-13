package ±¸Çö;

import java.util.Scanner;

public class Main2947 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = scan.nextInt();
		}
		
		while(true) {
			
			if(arr[0]>arr[1]) {
				int temp = arr[0];
				arr[0] = arr[1];
				arr[1] = temp;
				System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
			}
			
			if(arr[1]>arr[2]) {
				int temp = arr[1];
				arr[1] = arr[2];
				arr[2] = temp;
				System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
			}
			
			if(arr[2]>arr[3]) {
				int temp = arr[2];
				arr[2] = arr[3];
				arr[3] = temp;
				System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
			}
			
			if(arr[3]>arr[4]) {
				int temp = arr[3];
				arr[3] = arr[4];
				arr[4] = temp;
				System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
			}
			
			if(arr[0]==1 && arr[1]==2 && arr[2]==3 && arr[3]==4) {
				break;
			}
		}
		
		scan.close();
	}

}
