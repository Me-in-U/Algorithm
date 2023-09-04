package Bronze_II.P29614번_학점계산프로그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] rank = br.readLine().toCharArray();
    double sum = 0;
    int count = 0;
    for (int i = 0; i < rank.length; i++) {
      if (rank[i] == '+') {
        sum += 0.5;
        count++;
      } else if (rank[i] == 'A') {
        sum += 4.0;
      } else if (rank[i] == 'B') {
        sum += 3.0;
      } else if (rank[i] == 'C') {
        sum += 2.0;
      } else if (rank[i] == 'D') {
        sum += 1.0;
      }
    }
    System.out.println(sum / (rank.length - count));
  }
}