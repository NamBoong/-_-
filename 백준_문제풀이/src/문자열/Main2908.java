package ¹®ÀÚ¿­;

import java.util.Scanner;

public class Main2908 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a%10>b%10) {
			System.out.printf((a%10) + "" + ((a-(a%10))/10)%10 + "" + a/100);
		}
		
		if(a%10<b%10) {
			System.out.println((b%10) + "" + ((b-(b%10))/10)%10 + "" + b/100);
		}
		
		if(a%10==b%10) {
			if(((a-(a%10))/10)%10>(b-(b%10))/10%10){
				System.out.println((a%10) + "" + ((a-(a%10))/10)%10 + "" + a/100);
			}
			if(((a-(a%10))/10)%10<(b-(b%10))/10%10){
				System.out.println((b%10) + "" + ((b-(b%10))/10)%10 + "" + b/100);
			}
		}
		
		if(a%10==b%10 && ((a-(a%10))/10)%10==(b-(b%10))/10%10) {
			if(a/100>b/100) {
				System.out.printf((a%10) + "" + ((a-(a%10))/10)%10 + "" + a/100);
			}
			if(a/100<b/100) {
				System.out.println((b%10) + "" + ((b-(b%10))/10)%10 + "" + b/100);
			}
		}
		
		scan.close();
	}

}
