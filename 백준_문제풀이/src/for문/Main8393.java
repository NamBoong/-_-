package for¹®;

import java.util.Scanner;

public class Main8393 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int answer = 0;
		
		for(int i=n; i>0; i--) {
			answer = answer + i;
		}
		
		System.out.println(answer);
		
		scan.close();
	}

}
