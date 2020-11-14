package ¼öÇÐ;

import java.util.Scanner;

public class Main5717 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			if(a==0 && b==0) {
				break;
			}
			
			System.out.println(answer(a, b));
		}
		
		scan.close();
	}
	
	public static int answer(int a, int b) {
		return a+b;
	}

}
