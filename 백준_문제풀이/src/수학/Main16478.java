package ¼öÇÐ;

import java.util.Scanner;

public class Main16478 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double ab = scan.nextInt();
		double bc = scan.nextInt();
		double cd = scan.nextInt();
		
		double answer = (ab*cd)/bc;
		
		if(answer==(int)answer) {
			System.out.println((int)answer);
		}
		else {
			System.out.format("%.6f", answer);
		}
		
		scan.close();
	}

}
