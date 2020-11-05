package ±¸Çö;

import java.util.Scanner;

public class Main1259 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			int n = scan.nextInt();
		
			if(n==0) {
				break;
			}
			else {				
				answer(n);
			}
		}
		
		scan.close();
	}
	
	public static void answer(int n) {
		
		String a = Integer.toString(n);
		
		String[] arr = a.split("");
		String b = "";
		
		for(int i=a.length()-1; i>=0; i--) {	
			b = b + arr[i];
		}
		
		if(a.equals(b)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}

}
