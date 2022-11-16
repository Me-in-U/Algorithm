package P1267번_핸드폰_요금;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    int N = Integer.parseInt(br.readLine());
    int[] Xi = new int[N];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      Xi[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(Xi);
    int teams = 0;
    int members = 0;
    int member_max = 0;
    for (int i = 0; i < N; i++) {
      if (member_max == 0) {
        member_max = Xi[i];
      }
      members++;
      if (members == member_max) {
        teams++;
        members = 0;
        member_max = 0;
      }
    }
    if (members > 0) {
      teams++;
    }
    System.out.println(teams);
  }
}