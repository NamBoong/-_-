package ±¸Çö;

import java.util.Scanner;

public class Main10988 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		System.out.println(answer(a));
		scan.close();
	}
	
	public static int answer(String a) {
		
		String[] arr = a.split("");
		
		int count = 0;
		
		for(int i=0; i<a.length()-1; i++) {
			if(arr[i].equals(arr[a.length()-1-i])) {
				count++;
			}
		}
		
		if(count==a.length()-1) {
			return 1;
		}
		else {
			return 0;
		}
			
		
	}

}
