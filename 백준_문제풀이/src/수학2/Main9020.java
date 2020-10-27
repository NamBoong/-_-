package ¼öÇÐ2;

import java.util.Scanner;

public class Main9020 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();
		
		while(n>0) {
			int a = scan.nextInt();
			answer(a);
			n--;
		}

		scan.close();
		
	}
	
	public static void answer(int n) {
		
		boolean[] prime = new boolean[10001];
		
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i]) {
				continue;
			}
		
			for(int j = i*i; j<prime.length; j = j+i) {
				prime[j] = true;
			}
		}
		
		int first = n/2;
		int second = n/2;
		
		while(true) {
			if(prime[first]==false && prime[second]==false) {
				System.out.println(first + " " + second);
				break;
			}
			
			first--;
			second++;
		}
		
	}

}
