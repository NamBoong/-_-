package one차원배열;

import java.util.Scanner;

public class Main4344 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		int count = 0;
		int[] arr2 = new int[0];
		
		int[] answer = new int[n];
		int[] num = new int[n];
		
		while(count<n) {
			arr[count] = scan.nextInt();
			
			arr2 = new int[arr[count]];
			
			for(int i=0; i<arr[count]; i++) {
				arr2[i] = scan.nextInt();
				
				answer[count] = answer[count] + arr2[i];
			}
			
			answer[count] = answer[count]/arr[count];
			
			for(int i=0; i<arr[count]; i++) {
				if(arr2[i]>answer[count]) {
					num[count]++;
				}
			}
			
			System.out.format("%.3f", (double)num[count]/arr[count]*100);
			System.out.println("%");
			
			count++;
		}
		
		scan.close();

	}

}
