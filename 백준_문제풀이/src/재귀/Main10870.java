package Àç±Í;

import java.util.Scanner;

public class Main10870 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		int n = scan.nextInt();
		
		answer(n);
		
		scan.close();
	}
	
	public static void answer(int n) {
		
		int nn = n;
		int count = 1;
		int a = 0;
		int b = 1;
		int c = 1;
		
		if(nn==0) {
			System.out.println(0);
		}
		
		else if(nn==1) {
			System.out.println(1);
		}
		 
		else if(nn>=2) {
			while(count<nn) {
			
				c = a+b;
				
				a = b;
				b = c;
	
				count++;
			}
			System.out.println(c);
		}
	}

}
