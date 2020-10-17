package ¼öÇÐ2;

import java.util.Scanner;

public class Main4948 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		while(true) {
			int n = scan.nextInt();
			
			if(n==0) {
				break;
			}
			else {
				answer(n);
			}
		}

		scan.close();
	}
	
	public static void answer(int n) {
		
		int num = n;
		
		int check = 0;
		int count = 0;
		
		for(int i=num+1; i<=num*2; i++) {
			if(i==1) {
				check=1;
			}
			
			int eratos = (int)Math.sqrt(i)+1;
			
			for(int l=2; l<eratos; l++) {
				if(i%l==0) {
					check=1;
					break;
				}
			}
		
			if(check==0) {
				count++;
			}
			
			check=0;
		}
		
		System.out.println(count);
	}

}
