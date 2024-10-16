package P28064번_이민희진;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String[] names = new String[N];
    for (int i = 0; i < N; i++) {
      names[i] = br.readLine();
    }
    int count = 0;
    for (int i = 0; i < N - 1; i++) {
      for (int j = i + 1; j < N; j++) {
        int minLength = Math.min(names[i].length(), names[j].length());
        for (int k = 0; k < minLength; k++) {
          if (names[i].substring(0, k + 1).equals(names[j].substring(names[j].length() - k - 1, names[j].length()))) {
            count++;
            break;
          } else if (names[j].substring(0, k + 1)
              .equals(names[i].substring(names[i].length() - k - 1, names[i].length()))) {
            count++;
            break;
          }
        }
      }
    }
    System.out.println(count);
  }
}