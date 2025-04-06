package BAEKJOON.Bronze.Bronze_I.P23746번_문자열_압축_해제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    String[] data = new String[26];
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      String comp = st.nextToken();
      int upper = st.nextToken().charAt(0) - 'A';
      data[upper] = comp;
    }
    StringBuilder sb = new StringBuilder();
    String comp_ed = br.readLine();
    for (int i = 0; i < comp_ed.length(); i++) {
      sb.append(data[comp_ed.charAt(i) - 'A']);
    }
    st = new StringTokenizer(br.readLine());
    System.out.println(sb.toString().substring(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken())));
  }
}