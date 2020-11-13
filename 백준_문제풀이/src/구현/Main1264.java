package ±¸Çö;

import java.util.Scanner;

public class Main1264 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			
			String a = scan.nextLine();
			
			if(a.equals("#")) {
				break;
			}
			
			System.out.println(answer(a));
		}
		
		scan.close();
	}
	
	public static int answer(String a) {
		
		String[] arr = a.split("");
		
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") ||
				arr[i].equals("u") || arr[i].equals("A") || arr[i].equals("E") || arr[i].equals("I") ||
				arr[i].equals("O") || arr[i].equals("U")) {
				count++;
			}
		}
		
		return count;
	}

}