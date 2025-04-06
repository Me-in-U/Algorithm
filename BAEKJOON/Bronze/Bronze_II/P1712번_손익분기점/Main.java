package BAEKJOON.Bronze.Bronze_II.P1712번_손익분기점;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(st.nextToken());
      
		if(B >= C){
      System.out.println("-1");
    }
    else{
      System.out.println(A / (C - B) + 1);
    }
	}
}