package BAEKJOON.Silver.Silver_III.P20291번_파일_정리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    Map<String, Integer> map = new HashMap<>();
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine(), ".");
      st.nextToken();
      String ext = st.nextToken();
      if (map.containsKey(ext)) {
        map.put(ext, (map.get(ext) + 1));
      } else {
        map.put(ext, 1);
      }
    }
    List<String> list = new ArrayList<>(map.keySet());
    list.sort((s1, s2) -> s1.compareTo(s2));
    for (String key : list) {
      System.out.println(key + " " + map.get(key));
    }
  }
}