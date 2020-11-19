package ±¸Çö;

import java.util.Scanner;

public class Main9517 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int start = scan.nextInt();
		int test = scan.nextInt();
		int[] time = new int[test];
		String[] type = new String[test];
		
		for(int i=0; i<test; i++) {
			time[i] = scan.nextInt();
			type[i] = scan.next();
		}
		
		int goal = 210;
		
			for(int i=0; i<test; i++) {
				
				if(type[i].equals("T")) {
					goal = goal - time[i];
					
					if(goal<=0) {
						System.out.println(start);
						break;
					}
					
					start++;
					
					if(start>=9) {
						start = 1;
					}					
				}
				if(type[i].equals("N") || type[i].equals("P")) {
					goal = goal - time[i];
					
					if(goal<=0) {
						System.out.println(start);
						break;
					}
				}
				
			}

		
		scan.close();
	}

}
