package ¹®ÀÚ¿­;

import java.util.Scanner;

public class Main1316 {
	
	static Scanner scan = new Scanner(System.in);
	
	static int n = scan.nextInt();

	public static void main(String[] args) {

		answer(n);
		
		scan.close();
	}
	
	public static void answer(int n) {
		
		int nn = n;
		int answer = n;
		String[] arr = new String[answer];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.next();
		}
	
		for(int i=0; i<nn; i++) {
			
			boolean[] check = new boolean[26];
			
			for(int j=1; j<arr[i].length(); j++) {
				if(arr[i].charAt(j-1)!=arr[i].charAt(j)) {
					if(check[arr[i].charAt(j)-97]==true) {
						answer--;
						break;
					}
					check[arr[i].charAt(j-1)-97] = true;
				}
			}
		}

		System.out.println(answer);
	}

}
