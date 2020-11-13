package ¹®ÀÚ¿­;

import java.util.Scanner;

public class Main4470 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String[] arr = new String[n+1];
		
		for(int i=0; i<n+1; i++) {
			arr[i] = scan.nextLine();
		}
		
		int count = 1;
		
		for(int i=1; i<n+1; i++) {
			System.out.println(answer(count, arr[i]));
			count++;
		}
		
		scan.close();
	}
	public static String answer(int count, String a) {
		
		String answer = Integer.valueOf(count) + ". " + a;
		
		return answer;
	}

}
