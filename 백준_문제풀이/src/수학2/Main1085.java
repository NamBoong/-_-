package ¼öÇÐ2;

import java.util.Scanner;

public class Main1085 {
	
	static Scanner scan = new Scanner(System.in);
	
	static int x = scan.nextInt();
	static int y = scan.nextInt();
	static int w = scan.nextInt();
	static int h = scan.nextInt();

	public static void main(String[] args) {

		answer(x, y, w, h);
		
		scan.close();
	}
	
	public static void answer(int x, int y, int w, int h) {
		
		int xx = x;
		int yy = y;
		int ww = w;
		int hh = h;
		
		int one = xx-0;
		int two = ww-xx;
		int three = yy-0;
		int four = hh-yy;
		
		System.out.println(Math.min(Math.min(one, two), Math.min(three, four)));
	}

}
