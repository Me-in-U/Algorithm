package P27111번_출입_기록;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    HashMap<Integer, Integer> map = new HashMap();
    int N = Integer.parseInt(br.readLine());
    int errorCount = 0;
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int person = Integer.parseInt(st.nextToken());
      int inout = Integer.parseInt(st.nextToken());
      if (map.containsKey(person)) {
        if (map.get(person) == inout) {
          errorCount++;
        } else {
          map.put(person, inout);
        }
      } else {
        if (inout == 0) {
          errorCount++;
        }
        map.put(person, inout);
      }
    }
    for (int val : map.values()) {
      if (val == 1) {
        errorCount++;
      }
    }
    System.out.println(errorCount);
  }
}