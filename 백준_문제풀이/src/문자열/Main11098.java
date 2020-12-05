package ¹®ÀÚ¿­;

import java.util.Scanner;

public class Main11098 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] test = new int[n];
		String[] answer = new String[n];
		
		for(int i=0; i<n; i++) {
			test[i] = scan.nextInt();
			
			int[] money = new int[test[i]];
			String[] name = new String[test[i]];
			
			for(int j=0; j<test[i]; j++) {
				money[j] = scan.nextInt();
				name[j] = scan.next();
			}
			
			int go = 0;
			int num = 0;
			for(int j=0; j<test[i]; j++) {
				if(go<money[j]) {
					go = money[j];
					num = j;
				}
			}
			
			answer[i] = name[num];
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(answer[i]);
		}
		
		scan.close();
	}

}
