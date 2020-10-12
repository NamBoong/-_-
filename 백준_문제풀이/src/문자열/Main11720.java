package ¹®ÀÚ¿­;

import java.util.Scanner;

public class Main11720 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();	
		String a = scan.next();
		String[] arr = a.split("");
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum = sum + Integer.valueOf(arr[i]);
		}
		
		System.out.println(sum);
		scan.close();
	}

}
