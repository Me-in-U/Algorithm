package P1049번_기타줄;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int minPack = 1001;
    int minString = 1001;
    int minCost = 1000001;
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      minPack = Math.min(minPack, Integer.parseInt(st.nextToken()));
      minString = Math.min(minString, Integer.parseInt(st.nextToken()));
    }
    for (int i = 0; i <= N; i++) {
      int leftStrings = N;
      int cost = 0;
      cost += i * minString;
      leftStrings -= i;
      if (leftStrings != 0) {
        cost += (leftStrings / 6) * minPack;
      }
      leftStrings %= 6;
      if (leftStrings != 0) {
        cost += minPack;
      }
      minCost = Math.min(minCost, cost);
    }
    System.out.println(minCost);
  }
}