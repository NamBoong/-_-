package ¼öÇĞ;

import java.util.Scanner;

public class Main3062 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.next();
		}
		
		sum(arr);
		
		scan.close();
	}
	
	public static void sum(String[] arr) {
		
		String[] reverse = new String[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			reverse[i] = "";
		}
		
		int count = 0;
		
		while(count<arr.length) {
			
			String[] sp = arr[count].split("");
			
			for(int i=sp.length-1; i>=0; i--) {
				reverse[count] = reverse[count] + sp[i];
			}
			count++;
		}
				
		int[] sum = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			sum[i] = Integer.parseInt(arr[i]) + Integer.parseInt(reverse[i]);
		}	
		
		answer(sum);
	}
	
	public static void answer(int[] sum) {
		
		String[] arr = new String[sum.length];
		String[] rearr = new String[sum.length];
		
		for(int i=0; i<sum.length; i++) {
			arr[i] = Integer.toString(sum[i]);
		}
		for(int i=0; i<sum.length; i++) {
			rearr[i] = "";
		}
		
		int count = 0;
		
		while(count<arr.length) {
			for(int i=arr[count].length()-1; i>=0; i--) {
				rearr[count] = rearr[count] + arr[count].charAt(i);
			}
			count++;
		}
		
		for(int i=0; i<sum.length; i++) {
			if(arr[i].equals(rearr[i])) {
				System.out.print("YES\n");
			}
			else {
				System.out.print("NO\n");
			}
		}
	}

}
