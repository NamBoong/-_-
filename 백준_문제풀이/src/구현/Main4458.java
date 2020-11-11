package ±¸Çö;

import java.util.Scanner;

public class Main4458 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String[] arr = new String[n+1];
		
		for(int i=0; i<=n; i++) {
			arr[i] = scan.nextLine();
		}
		
		int count = 1;
		
		while(count<=n) {
			
			String[] a = arr[count].split("");
			
			a[0] = a[0].toUpperCase();
			
			for(int i=0; i<a.length; i++) {
				System.out.printf(a[i]);
			}
			System.out.println();
			count++;
		}

		scan.close();
	}

}
