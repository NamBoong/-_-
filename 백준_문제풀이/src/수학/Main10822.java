package ¼öÇÐ;

import java.util.Scanner;

public class Main10822 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		
		String[] arr = a.split(",");
		
		int answer = 0;
		
		for(int i=0; i<arr.length; i++) {
			answer = answer + Integer.parseInt(arr[i]);
		}
		
		System.out.println(answer);
		scan.close();
	}

}
