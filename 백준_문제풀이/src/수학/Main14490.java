package ¼öÇĞ;

import java.util.Scanner;
	
public class Main14490 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String n = scan.nextLine();
		String[] arr = n.split(":");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
			for(int i=2; i<=Math.min(a, b); i++) {
				if(a%i==0 && b%i==0) {
					a = a/i;
					b = b/i;
					i = 2;
				}
			}
			System.out.println(a+":"+b);

		scan.close();
	}
}
