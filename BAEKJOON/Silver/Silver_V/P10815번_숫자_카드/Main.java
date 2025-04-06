package BAEKJOON.Silver.Silver_V.P10815번_숫자_카드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;


class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
      StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
      st = new StringTokenizer(br.readLine());
      HashSet<Integer> set = new HashSet<Integer>(N, 0.7f);
		for(int i = 0; i < N; i++){
         set.add(Integer.parseInt(st.nextToken()));
		}

      int M = Integer.parseInt(br.readLine());
      st = new StringTokenizer(br.readLine());
      for(int i = 0; i < M; i++){
         if(set.contains(Integer.parseInt(st.nextToken())))
            sb.append("1 ");
         else
            sb.append("0 ");
      }
      System.out.println(sb.toString());
	}
}