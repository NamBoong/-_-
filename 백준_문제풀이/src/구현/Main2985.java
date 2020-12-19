package ±¸Çö;

import java.util.Scanner;

public class Main2985 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		sum(a, b, c);
		scan.close();
	}
	
	public static void sum(int a, int b, int c) {
		
		if(a+b==c) {
			System.out.println(a+"+"+b+"="+c);
		}
		else if(a-b==c) {
			System.out.println(a+"-"+b+"="+c);
		}
		else if(a*b==c) {
			System.out.println(a+"*"+b+"="+c);
		}
		else if(a/b==c) {
			System.out.println(a+"/"+b+"="+c);
		}
		else if(a==b+c) {
			System.out.println(a+"="+b+"+"+c);
		}
		else if(a==b-c) {
			System.out.println(a+"="+b+"-"+c);
		}
		else if(a==b*c) {
			System.out.println(a+"="+b+"*"+c);
		}
		else if(a==b/c) {
			System.out.println(a+"="+b+"/"+c);
		}
		
	}

}
