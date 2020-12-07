package ¼öÇÐ;

import java.util.Scanner;

public class Main2755 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String[][] arr = new String[n][3];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = scan.next();
			}
		}
		
		int[] time = new int[n];
		String[] score = new String[n];

		for(int i=0; i<n; i++) {
			time[i] = Integer.parseInt(arr[i][1]);
			score[i] = arr[i][2];
		}

		change(time, score);		
		scan.close();
	}
	
	public static void change(int[] time, String[] score) {
		
		Double answer = 0.00;
		Double all = 0.00;
		
		for(int i=0; i<time.length; i++) {
			
			Double ts = 0.00;		
			switch(score[i]) {
				case "A+" : ts = 4.30;
				break;
				case "A0" : ts = 4.00;
				break;
				case "A-" : ts = 3.70;
				break;
				case "B+" : ts = 3.30;
				break;
				case "B0" : ts = 3.00;
				break;
				case "B-" : ts = 2.70;
				break;
				case "C+" : ts = 2.30;
				break;
				case "C0" : ts = 2.00;
				break;
				case "C-" : ts = 1.70;
				break;
				case "D+" : ts = 1.30;
				break;
				case "D0" : ts = 1.00;
				break;
				case "D-" : ts = 0.70;
				break;
				case "F0" : ts = 0.00;
				break;
			}
			all = all + time[i];
			answer = answer + time[i]*ts;
		}
		
		System.out.format("%.2f", answer/all);
	}

}
