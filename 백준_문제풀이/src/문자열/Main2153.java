package ¹®ÀÚ¿­;

import java.util.Scanner;

public class Main2153 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		int answer = 0;
		
		for(int i=0; i<a.length(); i++) {
			if((int)a.charAt(i)<=90) {
				answer = answer + (int)a.charAt(i) - 38;
			}
			
			if((int)a.charAt(i)>=97) {
				answer = answer + (int)a.charAt(i) - 96;
			}
		}
		
		System.out.println(answer(answer));
		scan.close();
	}
	
	public static String answer(int n) {
		
		  boolean[] arr = new boolean[n+1];
	        arr[0] = false;
	        arr[1] = true;
	        for(int i=2; i<=n; i+=1) {
	            arr[i] = true;
	        }
	 
	        for(int i=2; i*i<=n; i+=1) {
	            for(int j=i*i; j<=n; j+=i) {
	                arr[j] = false; 
	            }
	        }
	        
	        if(arr[n]==false) {
	        	return "It is not a prime word.";
	        }
	        else {
	        	return "It is a prime word.";
	        }
	}

}
