package ¼öÇÐ1;

import java.util.Scanner;

public class Main1193 {

	static Scanner scan = new Scanner(System.in);
	
	static int n = scan.nextInt();
	
	public static void main(String[] args) {

		answer(n);
		
		scan.close();
	}
	
	public static void answer(int a) {
		
		int num = a;
		int sum = 1;
		
		int find = 0;
		int go = 0;
		
		for(int i=1; i<=1000000000; i++) {
			if(num>=sum) {
				sum = sum + i;
			}
			
			if(num<sum) {
				go = i+1;
				find = sum - num;
				break;
			}
		}
		
		if(go%2==0) {
				System.out.println(find + "/" + (go-find));
		}
		
		if(go%2==1) {
			System.out.println((go-find) + "/" + find);
	}
	}

}
