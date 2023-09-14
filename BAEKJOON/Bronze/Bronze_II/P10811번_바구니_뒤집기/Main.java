package P10811번_바구니_뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= N; i++) {
      list.add(i);
    }
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int from = Integer.parseInt(st.nextToken()) - 1;
      int to = Integer.parseInt(st.nextToken());
      List<Integer> temp = new ArrayList<>();
      List<Integer> reversed = new ArrayList<>(list.subList(from, to));
      Collections.reverse(reversed);
      temp.addAll(list.subList(0, from));
      temp.addAll(reversed);
      temp.addAll(list.subList(to, N));
      list = temp;
    }
    StringBuilder sb = new StringBuilder();
    for (int n : list) {
      sb.append(n).append(' ');
    }
    System.out.print(sb.toString());
  }
}
