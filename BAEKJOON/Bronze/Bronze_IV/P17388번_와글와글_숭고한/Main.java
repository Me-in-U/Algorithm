package P17388번_와글와글_숭고한;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] scores = new int[3];
    for (int i = 0; i < 3; i++) {
      scores[i] = Integer.parseInt(st.nextToken());
    }
    String[] name = { "Soongsil", "Korea", "Hanyang" };
    if (scores[0] + scores[1] + scores[2] >= 100) {
      System.out.println("OK");
    } else {
      int minscore = Math.min(Math.min(scores[0], scores[1]), scores[2]);
      for (int i = 0; i < scores.length; i++) {
        if (scores[i] == minscore) {
          System.out.print(name[i]);
          break;
        }
      }
    }
  }
}