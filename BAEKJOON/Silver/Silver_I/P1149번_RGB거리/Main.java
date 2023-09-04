package P1149번_RGB거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    List<House> list = new LinkedList<>();
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int R = Integer.parseInt(st.nextToken());
      int G = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      list.add(new House(R, G, B));
    }
    House result = list.get(0);
    for (int i = 1; i < list.size(); i++) {
      int temp_R = list.get(i).R + Math.min(result.G, result.B);
      int temp_G = list.get(i).G + Math.min(result.R, result.B);
      int temp_B = list.get(i).B + Math.min(result.G, result.R);
      result.R = temp_R;
      result.G = temp_G;
      result.B = temp_B;
    }

    System.out.print(Math.min(result.R, Math.min(result.G, result.B)));
  }
}

class House {
  int R = 0;
  int G = 0;
  int B = 0;

  House(int R, int G, int B) {
    this.R = R;
    this.G = G;
    this.B = B;
  }
}