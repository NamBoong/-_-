package ¼öÇÐ;

import java.util.Scanner;

public class Main17496 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int day = scan.nextInt();
		int wait = scan.nextInt();
		int room = scan.nextInt();
		int money = scan.nextInt();
				
		System.out.println(answer(day, wait, room, money));
		
		scan.close();
	}
	
	public static int answer(int day, int wait, int room, int money) {
		
		int today = 1;
		int answer = 0;
		
		while(today<=day) {
			
			if(today+wait<=day) {
				answer = answer + (room*money);
				today = today + wait;
			}
			else {
				break;
			}
		}
		
		return answer;
	}

}
