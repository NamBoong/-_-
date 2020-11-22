package ¼öÇĞ;

import java.util.Scanner;

public class Main2525 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		int min = scan.nextInt();
		int time = scan.nextInt();
		
		answer(hour, min, time);
		
		scan.close();
	}
	
	public static void answer(int hour, int min, int time) {
		
		int newmin = min+time;
		
		int plushour = newmin/60;
		int plusmin = newmin%60;
		
		int answerhour = plushour + hour;
		
		if(answerhour>=24) {
			System.out.println(answerhour-24 + " " + plusmin);
		}
		else {
			System.out.println(answerhour + " " + plusmin);
		}
	}

}
