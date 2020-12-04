package ¼öÇÐ;

import java.util.Scanner;

public class Main1292 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		String[] arr = a.split(" ");
		int n = 0;
		
		for(int i=0; i<arr.length; i++) {
			n = n + Integer.parseInt(arr[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(n);
		
		System.out.print(sb);
		scan.close();
	}

}
