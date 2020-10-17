package ¼öÇÐ1;

import java.util.Scanner;

public class Main2292 {
	
	static Scanner scan = new Scanner(System.in);
	
	static int n = scan.nextInt();

	public static void main(String[] args) {
		
		answer(n);

		scan.close();
	}
	
	public static void answer(int a) {
		int num = a;
		int sum = 1;
		
		for(int i=1; i<1000000000; i++) {
			if(num<=sum) {
				System.out.println(i);
				break;
			}
			else {
				sum = sum + 6*i;
			}
		}
	}

}
