package for¹®;

import java.util.Scanner;

public class Main2739 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(a + " * " + i + " = " + (a*i));
		}
		
		scan.close();
	}

}
