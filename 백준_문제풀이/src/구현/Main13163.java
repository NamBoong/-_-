package ±¸Çö;

import java.util.Scanner;

public class Main13163 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		String[] arr = new String[n+1];
		
		for(int i=0; i<=n; i++) {
			arr[i] = scan.nextLine();
		}
		
		for(int i=1; i<=n; i++) {
			String[] split = arr[i].split(" ");
			
			for(int j=0; j<split.length; j++) {
				if(j==0) {
					System.out.printf("god");
				}
				else {
					System.out.printf(split[j]);
				}
			}
			System.out.println();
			
		}
		
		scan.close();
	}

}
