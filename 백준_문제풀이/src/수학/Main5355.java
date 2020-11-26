package ¼öÇÐ;

import java.util.Scanner;

public class Main5355 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		double[] num = new double[n];
		String[] line = new String[n];
		
		for(int i=0; i<n; i++) {
			num[i] = scan.nextDouble();
			line[i] = scan.nextLine();
		}
		
		int count = 0;
		
		while(count<n) {
			
			String[] arr = line[count].split(" ");
			double answer = num[count];

			for(int i=1; i<arr.length; i++) {
				
				if(arr[i].equals("@")) {
					answer = answer*3;
				}
				if(arr[i].equals("%")) {
					answer = answer+5;
				}
				if(arr[i].equals("#")) {
					answer = answer-7;
				}
				
			}
			System.out.format("%.2f\n", answer);
			count++;
		}
		scan.close();
	}

}
