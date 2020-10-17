package ¼öÇÐ2;

import java.util.Scanner;

public class Main4153 {

	static Scanner scan = new Scanner(System.in);

	
	public static void main(String[] args) {

		while(true) {
			
			int n = scan.nextInt();
			int m = scan.nextInt();
			int l = scan.nextInt();
			
			if(n==0 && m==0 && l==0) {
				break;
			}
			else {
				answer(n, m, l);
			}
		}
		
		scan.close();

	}
	
	public static void answer(int a, int b, int c) {
		
		int aa = a;
		int bb = b;
		int cc = c;
		
		int max = Math.max(cc, Math.max(aa, bb));
		int min = Math.min(cc, Math.min(aa, bb));
		int mid = (aa+bb+cc) - max - min;
		
		if(Math.pow(max, 2)==Math.pow(min, 2)+Math.pow(mid, 2)) {
			System.out.println("right");
		}
		else {
			System.out.println("wrong");
		}
		
	}

}
