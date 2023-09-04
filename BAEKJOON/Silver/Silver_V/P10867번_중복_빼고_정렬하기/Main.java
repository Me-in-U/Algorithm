package Silver_V.P10867번_중복_빼고_정렬하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    HashSet<Integer> set = new HashSet<>();
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    StringTokenizer st = null;

    int N = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      set.add(Integer.parseInt(st.nextToken()));
    }
    Iterator<Integer> iter = set.iterator();
    while (iter.hasNext()) {
      pq.add(iter.next());
    }
    while (!pq.isEmpty()) {
      sb.append(pq.poll() + " ");
    }
    System.out.println(sb.toString());
  }
}