package P21316번_스피카;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    int Spica = 0;

    int[] edge_count = new int[13];
    ArrayList<Integer>[] graph = new ArrayList[13];
    for (int i = 1; i < 13; i++) {
      graph[i] = new ArrayList<>();
    }

    for (int i = 0; i < 12; i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      edge_count[x]++;
      edge_count[y]++;
      graph[x].add(y);
      graph[y].add(x);
    }
    for (int i = 1; i < 13; i++) {
      if (edge_count[i] == 3) {
        int sum = 0;
        for (int adj : graph[i]) {
          sum += edge_count[adj];
        }
        if (sum == 6) {
          Spica = i;
          break;
        }
      }
    }
    System.out.println(Spica);
  }
}