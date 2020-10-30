package ±¸Çö;

import java.util.Scanner;

public class Main10808 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		String a = scan.nextLine();
		
		answer(a);
		
		scan.close();
	}
	
	public static void answer(String go) {
		
		String[] arr = go.split("");
		
		int[] alpa = new int[26];
		
		for(int i=0; i<go.length(); i++) {
			if(arr[i].equals("a")) {
				alpa[0]++;
			}
			if(arr[i].equals("b")) {
				alpa[1]++;
			}
			if(arr[i].equals("c")) {
				alpa[2]++;
			}
			if(arr[i].equals("d")) {
				alpa[3]++;
			}
			if(arr[i].equals("e")) {
				alpa[4]++;
			}
			if(arr[i].equals("f")) {
				alpa[5]++;
			}
			if(arr[i].equals("g")) {
				alpa[6]++;
			}
			if(arr[i].equals("h")) {
				alpa[7]++;
			}
			if(arr[i].equals("i")) {
				alpa[8]++;
			}
			if(arr[i].equals("j")) {
				alpa[9]++;
			}
			if(arr[i].equals("k")) {
				alpa[10]++;
			}
			if(arr[i].equals("l")) {
				alpa[11]++;
			}
			if(arr[i].equals("m")) {
				alpa[12]++;
			}
			if(arr[i].equals("n")) {
				alpa[13]++;
			}
			if(arr[i].equals("o")) {
				alpa[14]++;
			}
			if(arr[i].equals("p")) {
				alpa[15]++;
			}
			if(arr[i].equals("q")) {
				alpa[16]++;
			}
			if(arr[i].equals("r")) {
				alpa[17]++;
			}
			if(arr[i].equals("s")) {
				alpa[18]++;
			}
			if(arr[i].equals("t")) {
				alpa[19]++;
			}
			if(arr[i].equals("u")) {
				alpa[20]++;
			}
			if(arr[i].equals("v")) {
				alpa[21]++;
			}
			if(arr[i].equals("w")) {
				alpa[22]++;
			}
			if(arr[i].equals("x")) {
				alpa[23]++;
			}
			if(arr[i].equals("y")) {
				alpa[24]++;
			}
			if(arr[i].equals("z")) {
				alpa[25]++;
			}
		}
		
		for(int i=0; i<26; i++) {
			System.out.printf(alpa[i] + " ");
		}
	}

}
