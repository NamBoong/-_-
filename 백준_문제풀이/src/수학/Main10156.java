package ¼öÇÐ;

import java.util.Scanner;

public class Main10156 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		if((k*n)-m<=0) {
			System.out.println(0);
		}
		else {
			System.out.println((k*n)-m);
		}
		scan.close();
	}

}
