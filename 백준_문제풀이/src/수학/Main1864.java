package ¼öÇÐ;

import java.util.Scanner;

public class Main1864 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			
			String a = scan.nextLine();
			
			if(a.equals("#")) {
				break;
			}
			
			System.out.println(answer(a));
		}
		
		scan.close();
	}
	
	public static int answer(String a) {
		
		String[] arr = a.split("");
		
		int answer = 0;
		int count = a.length()-1;
		
		while(count>=0) {
			
			for(int i=0; i<a.length(); i++) {
				
				if(arr[i].equals("-")) {
					answer = answer + 0*(int)Math.pow(8, count);
				}
				if(arr[i].equals("\\")) {
					answer = answer + 1*(int)Math.pow(8, count);
				}
				if(arr[i].equals("(")) {
					answer = answer + 2*(int)Math.pow(8, count);
				}
				if(arr[i].equals("@")) {
					answer = answer + 3*(int)Math.pow(8, count);
				}
				if(arr[i].equals("?")) {
					answer = answer + 4*(int)Math.pow(8, count);
				}
				if(arr[i].equals(">")) {
					answer = answer + 5*(int)Math.pow(8, count);
				}
				if(arr[i].equals("&")) {
					answer = answer + 6*(int)Math.pow(8, count);
				}
				if(arr[i].equals("%")) {
					answer = answer + 7*(int)Math.pow(8, count);
				}
				if(arr[i].equals("/")) {
					answer = answer + (-1)*(int)Math.pow(8, count);
				}
				count--;

			}		
		}
		
		return answer;
	}

}
