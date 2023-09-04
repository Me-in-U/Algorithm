package P5568번_카드_놓기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
  public static int[] cards;
  public static int[] make;
  public static int N;
  public static int K;
  public static HashSet<Integer> set;
  public static boolean[] used;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    K = Integer.parseInt(br.readLine());
    set = new HashSet<>();
    used = new boolean[N];
    cards = new int[N];
    make = new int[K];
    for (int i = 0; i < N; i++) {
      cards[i] = Integer.parseInt(br.readLine());
    }
    backtracking(0);
    System.out.println(set.size());
  }

  public static void backtracking(int count) {
    if (count == K) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < K; i++) {
        sb.append(make[i]);
      }
      set.add(Integer.parseInt(sb.toString()));
      return;
    }
    for (int i = 0; i < cards.length; i++) {
      if (!used[i]) {
        make[count] = cards[i];
        used[i] = true;
        backtracking(count + 1);
        used[i] = false;
      }
    }
  }
}