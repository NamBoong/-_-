package ¼öÇÐ3;

import java.util.Scanner;

public class Main2609 {

	static Scanner scan = new Scanner(System.in);
	
	static int a = scan.nextInt();
	static int b = scan.nextInt();
	
	public static void main(String[] args) {
		
		if(a>=b) {
			front(b);
		}
		
		if(a<b) {
			back(a);
		}

		scan.close();
	}
	
	public static void front(int num) {
		
		int c = num;
		
		for(int i=c; i>=1; i--) {
			if(a%i==0 && c%i==0) {
				System.out.println(i);
				break;
			}
		}
		
		for(int i=a; i<=1000000000; i++) {
			if(i%a==0 && i%c==0) {
				System.out.println(i);
				break;
			}
		}	
	}
	
	public static void back(int num) {
		
		int c = num;
		
		for(int i=c; i>=1; i--) {
			if(b%i==0 && c%i==0) {
				System.out.println(i);
				break;
			}
		}
		
		for(int i=b; i<=1000000000; i++) {
			if(i%b==0 && i%c==0) {
				System.out.println(i);
				break;
			}
		}	
	}

}
