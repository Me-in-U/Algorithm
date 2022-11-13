package _2022아주대학교_A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    HashSet<String> hashset = null;
    String[] level = { "B", "S", "G", "P", "D" };
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());
    String input = br.readLine();
    hashset = new HashSet<>(N);
    st = new StringTokenizer(input);
    for (int i = 0; i < N; i++) {
      hashset.add(st.nextToken());
    }
    for (int i = 0; i < 5; i++) {
      for (int j = 1000; j > 0; j--) {
        String str = level[i] + Integer.toString(j);
        if (hashset.contains(str)) {
          sb.append(str + " ");
        }
      }
    }
    String compare = sb.toString().trim();
    if (input.equals(compare)) {
      System.out.println("OK");
    } else {
      StringTokenizer st_input = new StringTokenizer(input);
      StringTokenizer st_compare = new StringTokenizer(compare);
      StringBuilder sb_result = new StringBuilder();
      for (int i = 0; i < N; i++) {
        String token_input = st_input.nextToken();
        String token_compare = st_compare.nextToken();
        if (!token_input.equals(token_compare)) {
          sb_result.append(token_compare + " ");
        }
      }
      System.out.println("KO");
      System.out.println(sb_result.toString().trim());
    }
  }
}