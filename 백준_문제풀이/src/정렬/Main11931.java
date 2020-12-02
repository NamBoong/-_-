package Á¤·Ä;

import java.util.Scanner;

public class Main11931 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] array = new int[n];
		int[] count = new int[2000001];
		int[] result = new int[n];
		
		for(int i=0; i<n; i++) {
			array[i] = scan.nextInt();
		}
		
		for(int i=0; i<array.length; i++) {
				count[array[i]+1000000]++;
		}
		
		for(int i=1; i<count.length; i++) {
			count[i] = count[i] + count[i-1];
		}
		
		for(int i=array.length-1; i>=0; i--) {
			int value = array[i]+1000000;		
			count[value]--;
			result[count[value]]=value-1000000;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=n-1; i>=0; i--) {
			sb.append(result[i]).append('\n');
		}
		System.out.println(sb);
		scan.close();
	}

}
