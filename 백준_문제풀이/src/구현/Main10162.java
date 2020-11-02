package ±¸Çö;

import java.util.Scanner;

public class Main10162 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		answer(n);
		
		scan.close();
	}
	
	public static void answer(int n) {
		
		int time = n;
		
		int acount = 0;
		int bcount = 0;
		int ccount = 0;
		
		while(time>=0) {
			
			if(time>=300) {
				acount++;
				time = time - 300;
			}
			
			if(time<300 && time>=60) {
				bcount++;
				time = time - 60;
			}
			
			if(time>=10 && time<60) {
				ccount++;
				time = time - 10;
			}
			
			if(time%10!=0) {
				System.out.println(-1);
				break;
			}
			
			if(time==0) {
				System.out.println(acount + " " + bcount + " " + ccount);
				break;
			}
		}
	}

}
