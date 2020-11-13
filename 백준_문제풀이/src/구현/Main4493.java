package ±¸Çö;

import java.util.Scanner;

public class Main4493 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] play = new int[n];

		for(int i=0; i<n; i++) {
			play[i] = scan.nextInt();
			
			String[][] arr = new String[play[i]][2];
			
			int one = 0;
			int two = 0;
			
			for(int j=0; j<play[i]; j++) {
				arr[j][0] = scan.next();
				arr[j][1] = scan.next();
				
				if(answer(arr[j][0], arr[j][1])==1) {
					one++;
				}
				if(answer(arr[j][0], arr[j][1])==2) {
					two++;
				}
			}
			
			if(one>two) {
				System.out.println("Player 1");
			}
			if(one==two) {
				System.out.println("TIE");
			}
			if(one<two) {
				System.out.println("Player 2");
			}
		}
		
		
		scan.close();
	}
	
	public static int answer(String a, String b) {
		
		if(a.equals("R")) {
			if(b.equals("S")) {
				return 1;
			}
			else if(b.equals("P")) {
				return 2;
			}
			else {
				return -1;
			}
		}
		else if(a.equals("S")) {
			if(b.equals("R")) {
				return 2;
			}
			else if(b.equals("P")) {
				return 1;
			}
			else {
				return -1;
			}
		}
		else {
			if(b.equals("R")) {
				return 1;
			}
			else if(b.equals("S")) {
				return 2;
			}
			else {
				return -1;
			}
		}
		
	}
 

}
