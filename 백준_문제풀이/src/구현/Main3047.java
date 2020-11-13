package ±¸Çö;

import java.util.Scanner;

public class Main3047 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for(int i=0; i<3; i++) {
			arr[i] = scan.nextInt();
		}
		
		String a = scan.next();
		
		answer(arr[0], arr[1], arr[2], a);
		
		scan.close();
	}
	
	public static void answer(int a, int b, int c, String n) {
		
		String[] arr = n.split("");
		
		int max = Math.max(c, Math.max(a, b));
		int min = Math.min(c, Math.min(a, b));
		int mid = a+b+c-max-min;
		
		for(int i=0; i<3; i++) {
			if(arr[i].equals("A")) {
				System.out.printf(min + " ");
			}
			if(arr[i].equals("B")) {
				System.out.printf(mid + " ");
			}
			if(arr[i].equals("C")) {
				System.out.printf(max + " ");
			}
		}
		
	}

}
