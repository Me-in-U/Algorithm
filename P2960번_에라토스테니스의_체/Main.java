package P2960번_에라토스테니스의_체;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int min = 2;
    int eraseCount = 0;
    HashSet<Integer> set = new HashSet<>();
    for (int i = 2; i <= N; i++) {
      set.add(i);
    }
    while (!set.isEmpty()) {
      for (int i = min; i <= N; i += min) {
        if (set.contains(i)) {
          set.remove(i);
          eraseCount++;
          if (eraseCount == K) {
            System.out.print(i);
            set.clear();
            break;
          }
        }
      }
      while (!set.isEmpty()) {
        if (set.contains(++min)) {
          break;
        }
      }
    }
  }
}