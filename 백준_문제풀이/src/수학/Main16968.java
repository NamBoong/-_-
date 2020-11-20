package ¼öÇÐ;

import java.util.Scanner;

public class Main16968 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		
		System.out.println(answer(a));
		
		scan.close();
	}
	
	public static long answer(String a) {
		
		String[] arr = a.split("");
		long answer = 1;
		
		int num = 10;
		int alpa = 26;
		
		if(arr[0].equals("d")) {
			answer = num;
		}
		
		if(arr[0].equals("c")) {
			answer = alpa;
		}
		
		for(int i=1; i<arr.length; i++) {
		
			if(arr[i].equals("d") && arr[i].equals(arr[i-1])) {
				num = 9;
				answer = answer * num;
			}
			
			else if(arr[i].equals("c") && arr[i].equals(arr[i-1])) {
				alpa = 25;
				answer = answer * alpa;
			}
			
			else if(arr[i].equals("d") && arr[i-1].equals("c")) {
				num = 10;
				answer = answer * num;
			}
			
			else if(arr[i].equals("c") && arr[i-1].equals("d")) {
				alpa = 26;
				answer = answer * alpa;
			}
			
		}
		
		return answer;
	}

}
