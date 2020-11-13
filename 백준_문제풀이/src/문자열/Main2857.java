package ¹®ÀÚ¿­;

import java.util.Scanner;

public class Main2857 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[] arr = new String[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = scan.nextLine();
		}
		
		int count = 0;
		
		for(int i=0; i<5; i++) {
			if(arr[i].contains("FBI")) {
				System.out.printf((i+1) + " ");
				count++;
			}
		}
		
		if(count==0) {
			System.out.println("HE GOT AWAY!");
		}
		
		scan.close();
	}

}
