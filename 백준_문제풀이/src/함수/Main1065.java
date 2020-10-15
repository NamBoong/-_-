package ÇÔ¼ö;

import java.util.Scanner;

public class Main1065 {

	static Scanner scan = new Scanner(System.in);
	
	static int n = scan.nextInt();
	static int up = 0;
	
	
	public static void main(String[] args) {

		for(int i=1; i<=n; i++) {	
			answer(i);
		}
		
		System.out.println(up);
		
		scan.close();
	}
	
	public static void answer(int number) {
		
		int check = number;
		
		if(check<100) {
			up++;
		}
		
		if(check>=100 && check<1000) {
			if((check/100)-(check-(check/100)*100)/10 == (check-(check/100)*100)/10 - check%10) {
				up++;
			}
		}
		
	}

}
