package P10801번_카드게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    int[] aCard = new int[10];
    int[] bCard = new int[10];
    int aWins = 0;
    int bWins = 0;
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < 10; i++) {
      aCard[i] = Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < 10; i++) {
      bCard[i] = Integer.parseInt(st.nextToken());
    }
    for (int i = 0; i < 10; i++) {
      if (aCard[i] > bCard[i]) {
        aWins++;
      } else if (aCard[i] < bCard[i]) {
        bWins++;
      }
    }
    if (aWins > bWins) {
      System.out.println("A");
    } else if (aWins < bWins) {
      System.out.println("B");
    } else {
      System.out.println("D");
    }
  }
}