package ±¸Çö;

import java.util.Scanner;

public class Main14467 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();		
		int[] cow = new int[n];
		int[] witch = new int[n];
		
		for(int i=0; i<n; i++) {
			cow[i] = scan.nextInt();
			witch[i] = scan.nextInt();
		}
		
		int answer = 0;
		
		int count = 0;
		
		while(count<n) {
			for(int i=count+1; i<n; i++) {
				if(cow[count]<=10 && cow[i]<=10) {
					if(cow[count]==cow[i]) {								
						if(witch[count]!=witch[i]) {
							answer++;
							cow[i] = 99;
							witch[count] = witch[i];
						}
						if(witch[count]==witch[i]) {
							cow[i] = 99;
						}
					}
				}
			}
			count++;
		}
		
		System.out.println(answer);
		scan.close();
	}

}
