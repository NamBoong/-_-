package one차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class Main1546 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		Double[] arr = new Double[n];
		Double sum = 0.0;
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextDouble();
			sum = sum + arr[i];
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<n; i++) {
			arr[i] = arr[i]/arr[n-1]*100;
		}

		Double answer = 0.0;
		
		for(int i=0; i<n; i++) {
			answer = answer + arr[i];
		}
		
		System.out.println(answer/n);
		
		scan.close();
	}

}
