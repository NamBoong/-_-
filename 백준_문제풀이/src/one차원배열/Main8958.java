package one차원배열;

import java.util.Scanner;

public class Main8958 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.next();
		}
		
		int count = 0;
		int[] answer = new int[n];
		int plus = 1;
	
		while(count<n) {
			for(int i=0; i<arr[count].length(); i++) {
				
				if(arr[count].charAt(i)==79) {
					answer[count] = answer[count] + plus;
					plus++;
				}
				
				if(arr[count].charAt(i)==88) {
					plus = 1;
				}
			}
			System.out.println(answer[count]);
			plus = 1;
			count++;
		}
		
		scan.close();
	}

}
