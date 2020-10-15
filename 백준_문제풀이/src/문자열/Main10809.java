package ¹®ÀÚ¿­;

import java.util.Scanner;

public class Main10809 {

	static Scanner scan = new Scanner(System.in);
	
	static String a = scan.next();
	static int[] arr = new int[26];
	
	public static void main(String[] args) {
		
		answer(a);
		
		for(int i=0; i<26; i++) {
			System.out.printf(arr[i] + " ");
		}
		
		scan.close();
	}
	
	public static void answer(String n) {
		
		for(int i=0; i<26; i++) {
			arr[i] = -1;
		}
		
		for(int i=0; i<a.length(); i++) {
			for(int j=97; j<=122; j++) {
				if(a.charAt(i)==j && arr[j-97]==-1) {
					arr[j-97] = i;
				}
			}		
		}
		
	}

}
