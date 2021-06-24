package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main15904 {

	public static void main(String[] args) throws Exception {
		//주어진 값을 받고 바로 답을 출력만 한다. 나머지는 ucpcfind 메서드가 결과를 찾는 수행을 한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(ucpcfind(br.readLine()));
	}
		
	static String ucpcfind(String string) {
		char[] UCPC = {'U', 'C', 'P', 'C'};
		//ucpc 배열의 숫자만큼 받은 string 문장이 ucpc를 가지고있는지 판별하기위한 것
		int num = 0;
		
		for(int i=0; i<string.length(); i++) {
			//ucpc의 맨 처음 배열의 값이 존재한다면 값을 올린다. 이는 ucpc의 서순이 중요하기 때문이다.
			if(string.charAt(i) == UCPC[num]) {
				num++;
			}
			
			//ucpc가 모두 서순대로 있다면 4가 된다. 그럼 리턴값은 love다.
			if(num == 4) {
				return "I love UCPC";
			}
		}
		
		return "I hate UCPC";
	}
		
}
