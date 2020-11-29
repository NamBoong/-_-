package ¼öÇÐ;

import java.util.Scanner;

public class Main5532 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int l = scan.nextInt();
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double d = scan.nextDouble();
		
		int aa = (int) Math.ceil(a/c);
		int bb = (int) Math.ceil(b/d);
		
		System.out.println(answer(l, aa, bb));
		scan.close();
	}
	
	public static int answer(int l, int aa, int bb) {
		
		int max = Math.max(aa, bb);
		
		return l-max;
	}

}
