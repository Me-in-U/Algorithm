package P10814번_나이순_정렬;

import java.io.IOException;import java.io.BufferedReader;import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(br.readLine());
    	String[] str;
    	int age = 0;
    	String name = "";
    	
    	//입력되는 나이의 범위 : 1 ~ 200
    	StringBuilder[] sb = new StringBuilder[201];

    	//객체배열의 인덱스에 각 stringBuilder 객체를 생성해준다.
    	for(int i=0; i<sb.length; i++) {
    		sb[i] = new StringBuilder();
    	}
    	
    	//카운팅 정렬 : 나이를 index로 하여 해당 배열에 나이와 이름을 append
    	for(int i=0; i<N; i++) {
    		str = br.readLine().split(" ");
    		age = Integer.parseInt(str[0]);
    		name = str[1];
    		sb[age].append(age).append(" ").append(name).append("\n");
    	}
    	
    	StringBuilder result = new StringBuilder();
    	for(StringBuilder val : sb) {
    		result.append(val);
    	}
    	System.out.println(result.toString());
    }
}