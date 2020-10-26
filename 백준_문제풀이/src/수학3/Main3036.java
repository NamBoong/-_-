package ¼öÇÐ3;

import java.util.Scanner;

public class Main3036 {

	static Scanner scan = new Scanner(System.in);
			
	public static void main(String[] args) {

		int n = scan.nextInt();
		
		answer(n);
		
		scan.close();
	}
	
	public static void answer(int n) {
	
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int count = 1;
		int a = 0;
		
		while(count<n) {
		
			for(int i=1; i<=arr[count]; i++) {
				if(arr[0]%i==0 && arr[count]%i==0) {
					a = i;
				}
			}
			
			System.out.println(arr[0]/a + "/" + arr[count]/a);
			count++;
		}
	}

}
