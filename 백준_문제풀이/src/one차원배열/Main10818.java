package one�����迭;

import java.util.Arrays;
import java.util.Scanner;

public class Main10818 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);

		System.out.println(arr[0] + " " + arr[n-1]);
		scan.close();
	}

}
