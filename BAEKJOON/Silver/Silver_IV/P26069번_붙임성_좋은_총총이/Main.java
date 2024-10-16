package P26069번_붙임성_좋은_총총이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    HashSet<String> dance = new HashSet();
    dance.add("ChongChong");

    boolean cc = false;
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      String name1 = st.nextToken();
      String name2 = st.nextToken();
      if (dance.contains(name1) || dance.contains(name2)) {
        dance.add(name1);
        dance.add(name2);
      }
    }
    System.out.println(dance.size());
  }
}