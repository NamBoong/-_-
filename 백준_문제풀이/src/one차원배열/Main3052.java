package one차원배열;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main3052 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = scan.nextInt();
			arr[i] = arr[i]%42;
			
		}
		
		LinkedHashSet<Integer> arr2 = new LinkedHashSet<Integer>();
		for(Integer answer : arr) {
			arr2.add(answer);
		}
		
		System.out.println(arr2.size());
		
		scan.close();
	}

}
