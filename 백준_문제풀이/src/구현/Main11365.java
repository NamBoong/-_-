package ±¸Çö;

import java.util.Scanner;

public class Main11365 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()==true){
			String a = scan.nextLine();
			
			if(a.equals("END")) {
				break;
			}
			else {
				answer(a);
			}
		}
		
		scan.close();
	}
	
	public static void answer(String a) {
		
		String[] arr = a.split("");
		
		for(int i=a.length()-1; i>=0; i--) {
			System.out.printf(arr[i]);
		}
		System.out.println();
	}

}
