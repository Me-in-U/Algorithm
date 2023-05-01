package P11931_수_정렬하기_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Collections;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++){
         int a = Integer.parseInt(br.readLine());
         pq.add(a);
		}
      while(!pq.isEmpty()){
         sb.append(pq.poll()).append('\n');
      }
      System.out.println(sb);
	}
}