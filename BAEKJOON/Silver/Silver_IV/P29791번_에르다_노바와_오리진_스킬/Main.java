package P29791번_에르다_노바와_오리진_스킬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    Set<Integer> nova = new HashSet<>(N);
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      nova.add(Integer.parseInt(st.nextToken()));
    }
    Set<Integer> origin = new HashSet<>(N);
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++) {
      origin.add(Integer.parseInt(st.nextToken()));
    }
    int nova_cool = 0;
    int origin_cool = 0;
    int stun_cool = 0;
    int ab_stun_cool = 0;
    int nova_count = 0;
    int origin_count = 0;
    for (int time = 1; time <= 1000000; time++) {
      if (nova.contains(time)) {
        if (nova_cool <= 0 && stun_cool <= 0) {
          nova_count++;
          nova_cool = 100;
          stun_cool = 90;
        }
      }
      if (origin.contains(time)) {
        if (origin_cool <= 0 && ab_stun_cool <= 0) {
          origin_count++;
          origin_cool = 360;
          ab_stun_cool = 90;
        }
      }
      nova_cool--;
      origin_cool--;
      stun_cool--;
      ab_stun_cool--;
    }
    System.out.println(nova_count + " " + origin_count);
  }
}