package Á¤·Ä;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main1427 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		String n = scan.next();
		
		answer(n);
		
		scan.close();
	}
	
	public static void answer(String n) {
		
		String nn = n;
		
		String[] arr = nn.split("");
		int[] arr2 = new int[nn.length()];
		
		for(int i=0; i<=nn.length()-1; i++) {
			arr2[i] = Integer.valueOf(arr[i]);
		}
		
		for(int i=0; i<=nn.length()-1; i++) {
			for(int j=i+1; j<=nn.length()-1; j++) {
				if(arr2[i]<arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		
		for(int i=0; i<=nn.length()-1; i++) {
			System.out.print(arr2[i]);
		}
	}

}
