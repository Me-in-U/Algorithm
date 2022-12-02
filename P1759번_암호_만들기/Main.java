package P1759번_암호_만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  private static int L, C, vowel, consonant;
  private static char[] arr;
  private static char[] result;
  private static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    st = new StringTokenizer(br.readLine());
    L = Integer.parseInt(st.nextToken());
    C = Integer.parseInt(st.nextToken());
    arr = br.readLine().replace(" ", "").toCharArray();
    result = new char[L];

    Arrays.sort(arr);

    password(0, 0);

    System.out.print(sb.toString());
  }

  public static void password(int depth, int pos) {
    if (depth == L) {
      if ((1 <= vowel) && (2 <= consonant)) {
        for (int i = 0; i < L; i++) {
          sb.append(result[i]);
        }
        sb.append('\n');
      }
      return;
    }
    for (int i = pos; i < C; i++) {
      result[depth] = arr[i];
      if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
        vowel++;
        password(depth + 1, i + 1);
        vowel--;
      } else {
        consonant++;
        password(depth + 1, i + 1);
        consonant--;
      }
    }
  }
}