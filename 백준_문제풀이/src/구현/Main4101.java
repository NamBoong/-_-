package ±¸Çö;

import java.util.Scanner;

public class Main4101 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			if(a!=0 && b!=0) {
				answer(a, b);
			}
			
			if(a==0 && b==0) {
				break;
			}
		}
		
		scan.close();
	}
	
	public static void answer(int a, int b) {
		
		if(a>b) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
	}

}
