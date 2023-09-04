package P1427번_소트인사이드;

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

      String str = br.readLine();
		for(int i = 0; i < str.length(); i++){
         pq.add((int)str.charAt(i)-48);
		}
      while(!pq.isEmpty()){
         sb.append(pq.poll());
      }
      System.out.println(sb);
	}
}