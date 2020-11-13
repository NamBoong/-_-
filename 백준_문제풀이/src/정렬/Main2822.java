package Á¤·Ä;

import java.util.Scanner;

public class Main2822 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[8];
		
		for(int i=0; i<8; i++) {
			arr[i] = scan.nextInt();
		}
		
		int[] arr2 = arr.clone();
		
		int sum = 0;
		
		for(int i=0; i<8; i++) {
			for(int j=i+1; j<8; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=3; i<8; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println(sum);
		
		int[] answer = new int[5];
		int count = 0;
		
		for(int i=3; i<8; i++) {
			for(int j=0; j<8; j++) {
				if(arr[i]==arr2[j]) {
					answer[count] = j+1;
				}
			}
			count++;
		}
		
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<5; j++) {
				if(answer[i]>answer[j]) {
					int temp = answer[i];
					answer[i] = answer[j];
					answer[j] = temp;
				}
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.printf(answer[i] + " ");
		}
		
		scan.close();
	}

}
