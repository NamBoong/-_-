package Á¤·Ä;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2751 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();
		
		answer(n);
		
		scan.close();
	}
	
	public static void answer(int n) {
		
		int nn = n;
		
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<nn; i++) {
			list.add(scan.nextInt());
		}
		
		Collections.sort(list);
		
		for(int value : list) {
			sb.append(value).append('\n');
		}
		
		System.out.println(sb);
	}

}
