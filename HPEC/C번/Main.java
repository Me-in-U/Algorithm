package HPEC.C번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    List<Character> chars = new LinkedList<>();
    String S = br.readLine();
    int HCount = 0;
    int YCount = 0;
    int UCount = 0;
    for (int i = 0; i < N; i++) {
      char c = S.charAt(i);
      chars.add(c);
      if (c == 'H') {
        HCount++;
      } else if (c == 'Y') {
        YCount++;
      } else if (c == 'U') {
        UCount++;
      }
    }
    StringTokenizer st = new StringTokenizer(br.readLine());
    int D = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    String[] SS = S.replace('H', ' ').replace('Y', ' ').replace('U', ' ').trim().split(" ");
    int cost = 0;
    for (String string : SS) {
      int deleteEach = string.length() * D;
      int deleteDrag = M + D;
      cost += deleteEach > deleteDrag ? deleteDrag : deleteEach;
    }
    System.out.println(cost == 0 ? "Nalmeok" : cost);
    int HYU = Math.min(HCount, Math.min(YCount, UCount));
    System.out.println(HYU == 0 ? "I love HanYang University" : HYU);
  }
}
