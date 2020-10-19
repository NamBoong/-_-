package 브루트포스;

import java.util.Scanner;

public class Main2798 {
	
	static Scanner scan = new Scanner(System.in);
	
	static int n = scan.nextInt();
	static int m = scan.nextInt();
	static int[] arr = new int[n];
	static int min = 0;

	public static void main(String[] args) {

		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int l=j+1; l<n; l++) {
					answer(arr[i], arr[j], arr[l]);
				}
			}
		}
		
		System.out.println(min);
		
		scan.close();
	}
	
	public static void answer(int a, int b, int c) {
		
		int aa = a;
		int bb = b;
		int cc = c;
		
		if(aa+bb+cc>min && aa+bb+cc<=m) {
			min = aa+bb+cc;
		}
		
	}

}
