package ±¸Çö;

import java.util.Scanner;

public class Main7567 {

	static int answer = 10;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		
		String[] arr = a.split("");
		
		for(int i=0; i<a.length(); i++) {
			if(i+1<a.length()) {
				answer(arr[i], arr[i+1]);
			}
		}
		
		System.out.println(answer);
		
		scan.close();
	}
	
	public static void answer(String a, String b) {
		
		if(a.equals(b)) {
			answer = answer + 5;
		}
		else {
			answer = answer + 10;
		}
		
	}

}
