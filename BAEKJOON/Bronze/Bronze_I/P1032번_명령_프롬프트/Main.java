package P1032번_명령_프롬프트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    char[] arr = br.readLine().toCharArray();
    int length = arr.length;
    for (int i = 0; i < N - 1; i++) {
      char[] comp = br.readLine().toCharArray();
      for (int j = 0; j < length; j++) {
        if (arr[j] != comp[j]) {
          arr[j] = '?';
        }
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < length; i++) {
      sb.append(arr[i]);
    }
    System.out.println(sb.toString());
  }
}
