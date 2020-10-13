package ¼öÇÐ1;

import java.util.Scanner;

public class Main2839 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int nocount = 0;
		
		while(true) {
			for(int i=n/5; i>=0; i--) {
	
				if((n-i*5)%3==0) {
					System.out.println(i+(n-i*5)/3);
					break;
				}
				
				if((n-i*5)%3!=0) {
					nocount++;
				}
			}		
			if(nocount==n/5+1) {
				System.out.println(-1);
				break;
			}
			
			break;
		}
		
		scan.close();
	}

}
