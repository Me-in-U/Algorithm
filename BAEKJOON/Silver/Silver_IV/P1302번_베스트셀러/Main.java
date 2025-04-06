package BAEKJOON.Silver.Silver_IV.P1302번_베스트셀러;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Integer> map = new HashMap<>();

    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      String name = br.readLine();
      map.put(name, map.getOrDefault(name, 0) + 1);
    }
    // System.out.println(map);
    String min_name = "";
    int max_count = 0;
    Iterator<String> keys = map.keySet().iterator();
    while (keys.hasNext()) {
      String key = keys.next();
      if (min_name.equals("")) {
        min_name = key;
        max_count = map.get(key);
      }
      if (map.get(key) == max_count) {
        if (key.compareTo(min_name) < 0) {
          min_name = key;
          max_count = map.get(key);
        }
      } else if (map.get(key) > max_count) {
        min_name = key;
        max_count = map.get(key);
      }
    }
    System.out.println(min_name);
  }
}
