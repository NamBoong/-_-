package Á¤·Ä;

import java.util.Scanner;

public class Main5635 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		String[] name = new String[n];
		int[] day = new int[n];
		int[] month = new int[n];
		int[] year = new int[n];
		
		for(int i=0; i<n; i++) {
			name[i] = scan.next();
			day[i] = scan.nextInt();
			month[i] = scan.nextInt();
			year[i] = scan.nextInt();
		}
		
		int maxyear = 0;
		int maxmonth = 0;
		int maxday = 0;
		
		int minyear = 2010;
		int minmonth = 12;
		int minday = 31;
		
		for(int i=0; i<n; i++) {
			if(maxyear<=year[i]) {
				maxyear = year[i];
			}
			if(minyear>=year[i]) {
				minyear = year[i];
			}
		}
		
		for(int i=0; i<n; i++) {
			if(maxyear==year[i]) {
				if(maxmonth<=month[i]) {
					maxmonth = month[i];
				}
			}
			
			if(minyear==year[i]) {
				if(minmonth>=month[i]) {
					minmonth = month[i];
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			if(maxyear==year[i]) {
				if(maxmonth==month[i]) {
					if(maxday<=day[i]) {
						maxday = day[i];
					}
				}
			}
			
			if(minyear==year[i]) {
				if(minmonth==month[i]) {
					if(minday>=day[i]) {
						minday = day[i];
					}
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			if(maxyear==year[i]) {
				if(maxmonth==month[i]) {
					if(maxday==day[i]) {
						System.out.println(name[i]);
					}
				}
			}
		}
		
		for(int i=0; i<n; i++) {	
			if(minyear==year[i]) {
				if(minmonth==month[i]) {
					if(minday==day[i]) {
						System.out.println(name[i]);
					}
				}
			}
		}
		
		scan.close();
	}

}
