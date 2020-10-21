package Á¤·Ä;

import java.util.Scanner;

public class Main2750 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();
		
		answer(n);
		
		scan.close();
	}
	
	public static void answer(int n) {
		
		int nn = n;
		
		int[] arr = new int[nn];
		
		for(int i=0; i<nn; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<nn; i++) {
			for(int j=i+1; j<nn; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<nn; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
