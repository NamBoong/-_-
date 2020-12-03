package Á¤·Ä;

import java.util.Scanner;

public class Main11399 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
			
		System.out.print(answer(arr, n));
		scan.close();
	}
	
	public static int answer(int[] arr, int n) {
		
		int[] count = new int[2000];
		int[] result = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		
		for(int i=1; i<count.length; i++) {
			count[i] = count[i] + count[i-1];
		}
		
		for(int i=arr.length-1; i>=0; i--) {
			int value = arr[i];		
			count[value]--;
			result[count[value]]=value;
		}
		
		int answer = 0;
		int go = 0;
		
		while(go<result.length) {		
			answer = answer + result[go]*(n-go);
			go++;
		}
		
		return answer;
		
	}

}
