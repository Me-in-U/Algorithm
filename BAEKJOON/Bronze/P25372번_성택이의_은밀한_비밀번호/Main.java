package P25372번_성택이의_은밀한_비밀번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      String password = br.readLine();
      int length = password.length();
      if (6 <= length && length <= 9) {
        sb.append("yes").append('\n');
      } else {
        sb.append("no").append('\n');
      }
    }
    System.out.print(sb.toString());
  }
}