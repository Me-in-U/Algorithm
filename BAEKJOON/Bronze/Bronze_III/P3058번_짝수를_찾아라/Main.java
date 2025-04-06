package BAEKJOON.Bronze.Bronze_III.P3058번_짝수를_찾아라;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

		int N =  Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int sum = 0;
      int min = 101;
      while(st.hasMoreTokens()) {
        int a = Integer.parseInt(st.nextToken());
        if(a % 2 == 0) {
          sum += a;
          if(min > a){
            min = a;
          }
        }
      }
      System.out.println(sum + " " + min);
    }
	}
}