package 수학;

import java.util.Scanner;

public class Main16944 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String a = scan.next();
		
		if(n>=6) {
			System.out.println(answer(a));
		}
		if(n<6) {
			if(6-n>=answer(a)) {
				System.out.println(6-n);
			}
			if(6-n<answer(a)) {
				System.out.println(answer(a));
			}
		}
		
		scan.close();
	}
	
	public static int answer(String a) {
		
		String[] arr = a.split("");
		int answer = 4;
		
		//숫자
		for(int i=0; i<arr.length; i++) {			
			if(arr[i].charAt(0)>=48 && arr[i].charAt(0)<=57) {
				answer--;
				break;
			}
		}		
		//소문자
		for(int i=0; i<arr.length; i++) {			
			if(arr[i].charAt(0)>=97 && arr[i].charAt(0)<=122) {
				answer--;
				break;
			}
		}
		//대문자
		for(int i=0; i<arr.length; i++) {			
			if(arr[i].charAt(0)>=65 && arr[i].charAt(0)<=90) {
				answer--;
				break;
			}
		}
		//특수문자
		if(a.contains("!") || a.contains("@") || a.contains("#") || a.contains("$") || a.contains("%") ||
			a.contains("^") || a.contains("&") || a.contains("*") || a.contains("(") || a.contains(")") ||
			a.contains("-") || a.contains("+")) {
			answer--;
		}
				
		return answer;
		
	}

}
