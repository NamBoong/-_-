package ¼öÇÐ;

import java.util.Scanner;

public class Main15873 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		
		if(a.length()==2) {
			System.out.print(two(a));
		}
		else if(a.length()==3) {
			System.out.print(three(a));
		}
		else if(a.length()==4) {
			System.out.print(20);
		}
		
		scan.close();
	}
	
	public static int two(String a) {
		
		String[] arr = a.split("");		
		return Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
	}
	
	public static int three(String a) {
		
		String[] arr = a.split("");
		
		if(arr[1].equals("0")) {
			return Integer.parseInt(arr[0])*10+Integer.parseInt(arr[1])+Integer.parseInt(arr[2]);
		}
		else {
			return Integer.parseInt(arr[0])+Integer.parseInt(arr[1])*10+Integer.parseInt(arr[2]);
		}
	}

}
