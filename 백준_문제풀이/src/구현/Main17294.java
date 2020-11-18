package 구현;

import java.util.Scanner;

public class Main17294 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		
		if(a.length()<=2) {
			System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
		}
		else {
			System.out.println(answer(a));
		}
		
		scan.close();
	}
	
	public static String answer(String a) {

		String[] arr = a.split("");
		
		int type = 0;
		
		for(int i=0; i<arr.length-2; i++) {
			if(Integer.parseInt(arr[i+1])-Integer.parseInt(arr[i])!=Integer.parseInt(arr[i+2])-Integer.parseInt(arr[i+1])) {
				type = 1;
			}
		}
		
		if(type==1) {
			return "흥칫뿡!! <(￣ ﹌ ￣)>";
		}
		else {
			return "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!";
		}
		
	}

}
