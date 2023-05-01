package P11652번_카드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<Long, Integer> map = new HashMap<>();
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      Long num = Long.parseLong(br.readLine());
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    Long keyMin = Long.MAX_VALUE;
    int valueMax = 0;
    for (Entry<Long, Integer> entry : map.entrySet()) {
      if (valueMax < entry.getValue()) {
        valueMax = entry.getValue();
        keyMin = entry.getKey();
      } else if (keyMin > entry.getKey() && valueMax == entry.getValue()) {
        keyMin = entry.getKey();
      }
    }
    System.out.println(keyMin);
  }
}