package ±¸Çö;

import java.util.Scanner;

public class Main17826 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[50];
		
		for(int i=0; i<50; i++) {
			arr[i] = scan.nextInt();
		}
		
		int hong = scan.nextInt();
		
		switching(answer(arr, hong));
		
		scan.close();
	}
	
	public static int answer(int[] arr, int hong) {
		
		int count = 1;
		
		for(int i=0; i<50; i++) {
			if(arr[i]>hong) {
				count++;
			}
		}
		
		return count;
		
	}
	
	public static void switching(int a) {
		
		if(a>=1 && a<=5) {
			System.out.println("A+");
		}
		else if(a>=6 && a<=15) {
			System.out.println("A0");
		}
		else if(a>=16 && a<=30) {
			System.out.println("B+");
		}
		else if(a>=31 && a<=35) {
			System.out.println("B0");
		}
		else if(a>=36 && a<=45) {
			System.out.println("C+");
		}
		else if(a>=46 && a<=48) {
			System.out.println("C0");
		}
		else{
			System.out.println("F");
		}
	}

}
