package 정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main10989 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {

	
		int n = Integer.parseInt(br.readLine());
		
		answer(n);
		
		br.close();
	}
	
	public static void answer(int n) throws Exception {
		
		int nn = n;
		
		int[] arr = new int[10000000];
		
		for(int i=0; i<nn; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=1; i<10000000; i++) {
			if(arr[i]>0) {
				for(int j=0; j<arr[i]; j++) {
					bw.write(Integer.toString(i) + "\n");
				}
			}
		}
		
		br.close();
		bw.close();
	}

}

// https://zoonvivor.tistory.com/43 이 쪽에 자세한 설명이 있습니다! 제 코드는 이 분의 코드를 보고 따라한 코드입니다~
