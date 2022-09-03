package P11782번_배열_합치기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    
    br.readLine();
    Arrays.stream((br.readLine() +" " + br.readLine()).split(" ")).mapToInt(Integer::parseInt).forEach(pq::offer);;

    while(!pq.isEmpty()){
      sb.append(pq.poll() + " ");
    }
    System.out.println(sb);
	}
}