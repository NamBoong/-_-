package for¹®;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine().trim());
		
		for(int i=0; i<n; i++) {
			String m = br.readLine();
			String[] answer = m.split(" ");
			
			int a = Integer.parseInt(answer[0]);
			int b = Integer.parseInt(answer[1]);
			
			bw.write((a+b) + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}

}
