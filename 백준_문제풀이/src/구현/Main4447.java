package ±¸Çö;

import java.util.Scanner;

public class Main4447 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		String[] arr = new String[n+1];
		
		for(int i=0; i<n+1; i++) {
			arr[i] = scan.nextLine();
		}
		
		for(int i=1; i<n+1; i++) {
			String[] split = arr[i].split("");
			
			int good = 0;
			int bad = 0;
			
			for(int j=0; j<split.length; j++) {
				if(split[j].equals("g") || split[j].equals("G")) {
					good++;
				}
				if(split[j].equals("b") || split[j].equals("B")) {
					bad++;
				}
			}
			
			if(good>bad) {
				System.out.println(arr[i] + " is GOOD");
			}
			if(good<bad) {
				System.out.println(arr[i] + " is A BADDY");
			}
			if(good==bad) {
				System.out.println(arr[i] + " is NEUTRAL");
			}
		}
		
		scan.close();
	}

}
