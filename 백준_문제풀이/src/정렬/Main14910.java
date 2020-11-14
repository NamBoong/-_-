package Á¤·Ä;

import java.util.Scanner;

public class Main14910 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		String[] arr = a.split(" ");
		
		int count = 0;
		
		for(int i=0; i<arr.length-1; i++) {
			if(Integer.parseInt(arr[i])>Integer.parseInt(arr[i+1])) {
					System.out.println("Bad");	
					break;
			}
			if(Integer.parseInt(arr[i])<=Integer.parseInt(arr[i+1])) {
				count++;
			}	

		}
		
		if(count==arr.length-1) {
			System.out.println("Good");
		}
		
		scan.close();
	}

}
