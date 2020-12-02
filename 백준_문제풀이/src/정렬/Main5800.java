package Á¤·Ä;

import java.util.Scanner;

public class Main5800 {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
			int[] array = new int[arr[i]];

			for(int j=0; j<arr[i]; j++) {
				array[j] = scan.nextInt();
			}
			answer(array, arr[i], (i+1));
		}
		
		System.out.print(sb);

		scan.close();
	}
	
	public static StringBuilder answer(int[] array, int n, int num) {
		
		int[] count = new int[101];
		int[] result = new int[n];
		
		for(int i=0; i<array.length; i++) {
				count[array[i]]++;
		}
		
		for(int i=1; i<count.length; i++) {
			count[i] = count[i] + count[i-1];
		}
		
		int gap = 0;
		for(int i=array.length-1; i>=0; i--) {
			int value = array[i];		
			count[value]--;
			result[count[value]]=value;
		}
		
		for(int i=1; i<n; i++) {
			if(result[i]-result[i-1]>gap) {
				gap = result[i]-result[i-1];
			}
		}
		
		return sb.append("Class ").append(num).append("\nMax ").append(result[n-1]).append(", Min ").append(result[0]).append(", Largest gap ").append(gap).append('\n');
	}

}
