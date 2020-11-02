package ±¸Çö;

import java.util.Scanner;

public class Main10987 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		
		answer(a);
		
		scan.close();
	}
	
	public static void answer(String a) {
		
		String[] arr = a.split("");
		
		int count = 0;
		
		for(int i=0; i<a.length(); i++) {
			if(arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")) {
				count++;
			}
		} 
		
		System.out.println(count);
	}

}
