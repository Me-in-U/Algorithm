package P2693번_N번째_큰_수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.PriorityQueue;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10, Collections.reverseOrder());
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    StringTokenizer st = null;
    for(int i = 0; i < T; i++){
      st = new StringTokenizer(br.readLine());
      while(st.hasMoreTokens()) {
        pq.add(Integer.parseInt(st.nextToken()));
      }
      pq.remove();
      pq.remove();
      sb.append(pq.poll()).append('\n');
      pq.clear();
    }
    System.out.println(sb.toString());
	}
}