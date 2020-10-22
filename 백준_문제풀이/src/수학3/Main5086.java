package ¼öÇÐ3;

import java.util.Scanner;

public class Main5086 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		while(true) {
			int n = scan.nextInt();
			int m = scan.nextInt();
				
			if(n==0 && m==0) {
				break;
			}
			else {
				answer(n, m);
			}
		}
		
		scan.close();
	}
	
	public static void answer(int n, int m) {
		
		int nn = n;
		int mm = m;
		
		if(mm%nn==0 & nn!=0 & mm!=0) {
			System.out.println("factor");
		}
		else if(nn%mm==0 & nn!=0 & mm!=0) {
			System.out.println("multiple");
		}
		else if(mm%nn!=0 & nn%mm!=0 & nn!=0 & mm!=0){
			System.out.println("neither");
		}
		
	}

}
