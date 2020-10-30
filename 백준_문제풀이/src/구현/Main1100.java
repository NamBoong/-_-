package ±¸Çö;

import java.util.Scanner;

public class Main1100 {
	
	static Scanner scan = new Scanner(System.in);
	static int count = 0; 
	static int check = 0;

	public static void main(String[] args) {

		for(int i=0; i<8; i++) {
			String n = scan.nextLine();
			
			String[] arr = n.split("");

			for(int j=0; j<8; j++) {
				if(i%2==0 && j%2==0) {
					answer(arr[j]);
				}
				
				if(i%2==1 && j%2==1) {
					answer(arr[j]);
				}
			}
		}
		
		scan.close();
	}
	
	public static void answer(String n) {
		
		if(n.equals("F")) {
			count++;
		}
			check++;
			
		if(check==32) {
			System.out.println(count);
		}
		
	}

}
