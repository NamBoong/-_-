package ¼öÇÐ;

import java.util.Scanner;

public class Main2501 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int num = scan.nextInt();
		
		int count = 0;
		
		while(count<=n) {
			
			for(int i=1; i<=n; i++) {
				if(n%i==0) {
					count++;
				}
				
				if(count==num) {
					System.out.println(i);
					break;
				}
			}
			
			if(count<num) {
				System.out.println(0);
				break;
			}
		}
		
		scan.close();
	}

}
