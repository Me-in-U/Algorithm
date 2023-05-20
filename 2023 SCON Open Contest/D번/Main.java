package D번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Map<Integer, Integer> num_pos = new HashMap<>();
    Map<Integer, Integer> pos_num = new HashMap<>();
    int N = Integer.parseInt(br.readLine());
    String[] input = br.readLine().split(" ");
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(input[i]);
      int pos = i + 1;
      if (num != pos) {
        num_pos.put(num, pos);
        pos_num.put(pos, num);
      }
    }
    int[] distance = new int[N + 1];
    for (int i = 1; i < N; i++) {
      if (num_pos.containsKey(i)) {
        int nowPos = num_pos.get(i);
        int replace = pos_num.get(i);
        distance[i] += nowPos - i;
        distance[replace] += nowPos - i;
        num_pos.remove(i);
        pos_num.remove(i);
        num_pos.put(replace, nowPos);
        pos_num.put(nowPos, replace);
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= N; i++) {
      sb.append(distance[i] + " ");
    }
    System.out.print(sb.toString());
  }
}