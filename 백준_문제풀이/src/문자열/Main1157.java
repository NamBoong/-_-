package ¹®ÀÚ¿­;

import java.util.Scanner;

public class Main1157 {
	
	static Scanner scan = new Scanner(System.in);
	
	static String n = scan.next().toUpperCase();

	public static void main(String[] args) {

		answer(n);
		
		scan.close();
	}
	
	public static void answer(String n) {
		
		String nn = n;
		
		int[] alpa = new int[26];
		int max = 0;
		char answer = '?';
		
		for(int i=0; i<nn.length(); i++) {
			alpa[n.charAt(i)-65]++;
			if(max<alpa[n.charAt(i)-65]) {
				answer = n.charAt(i);
				max = alpa[n.charAt(i)-65];
			}
			else if(max==alpa[n.charAt(i)-65]) {
				answer = '?';
			}
		}
		System.out.println(answer);
		
	}

}
