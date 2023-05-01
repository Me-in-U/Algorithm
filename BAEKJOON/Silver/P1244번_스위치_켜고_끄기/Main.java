package P1244번_스위치_켜고_끄기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static boolean[] lights;
  public static int N;
  public static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    N = Integer.parseInt(br.readLine());
    lights = new boolean[N + 1];
    st = new StringTokenizer(br.readLine());
    for (int i = 1; i <= N; i++) {
      if (Integer.parseInt(st.nextToken()) == 1) {
        lights[i] = true;
      } else {
        lights[i] = false;
      }
    }
    int people = Integer.parseInt(br.readLine());
    for (int i = 0; i < people; i++) {
      st = new StringTokenizer(br.readLine());
      int sex = Integer.parseInt(st.nextToken());
      int light = Integer.parseInt(st.nextToken());
      if (sex == 1) {
        man(light);
      } else if (sex == 2) {
        woman(light);
      }
    }
    print();
  }

  public static void man(int light) {
    for (int i = light; i <= N; i += light) {
      lights[i] = !lights[i];
    }
  }

  public static void woman(int light) {
    lights[light] = !lights[light];
    int count = 1;
    while (light - count >= 1 && light + count <= N && lights[light - count] == lights[light + count]) {
      lights[light - count] = !lights[light - count];
      lights[light + count] = !lights[light + count];
      count++;
    }
  }

  public static void print() {
    for (int i = 1; i <= N; i++) {
      if (lights[i])
        sb.append("1 ");
      else
        sb.append("0 ");
      if (i % 20 == 0) {
        sb.append('\n');
      }
    }
    System.out.print(sb.toString());
  }
}