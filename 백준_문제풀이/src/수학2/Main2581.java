package ¼öÇÐ2;

import java.util.Scanner;

public class Main2581 {

	static Scanner scan = new Scanner(System.in);
	
	static int m = scan.nextInt();
	static int n = scan.nextInt();
	static int sum = 0;
	static int min = 10000;

	public static void main(String[] args) {

		for(int i=m; i<=n; i++) {
			answer(i);
		}
		
		if(sum==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}

		scan.close();
	}
	
	public static void answer(int a) {
		
		int num = a;
		int count = 0;
		
		for(int i=2; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		
		if(count==1) {	
			if(min>num) {
				min = num;
			}
			sum = sum + num;
		}

	}

}
