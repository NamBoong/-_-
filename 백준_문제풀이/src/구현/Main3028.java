package ±¸Çö;

import java.util.Scanner;

public class Main3028 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		
		String[] arr = a.split("");
		
		System.out.println(answer(arr));
		scan.close();
	}
	
	public static int answer(String[] arr) {
		
		int ball = 1;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("A") && (ball==1 || ball==2)) {
				if(ball==1) {
					ball = 2;
				}
				else {
					ball = 1;
				}
			}
			else if(arr[i].equals("B") && (ball==2 || ball==3)) {
				if(ball==2) {
					ball = 3;
				}
				else {
					ball = 2;
				}
			}
			else if(arr[i].equals("C") && (ball==1 || ball==3)) {
				if(ball==1) {
					ball = 3;
				}
				else {
					ball = 1;
				}
			}
		}
		
		return ball;
	}

}
