package P30046번_HJS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  protected static int N;
  protected static String P;
  protected static String Q;
  protected static String R;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    P = br.readLine();
    Q = br.readLine();
    R = br.readLine();
    System.out.println(compare3());
  }

  public static String compare3() {
    for (int i = 0; i < N; i++) {
      char cP = P.charAt(i);
      char cQ = Q.charAt(i);
      char cR = R.charAt(i);
      // ! 다 같으면 pass
      if (cP == cQ && cP == cR)
        continue;
      // ! 다 다르면 홍진수
      if ((cP != cQ) && (cQ != cR) && (cR != cP))
        return "HJS! HJS! HJS!";
      // ! 두개가 같으면 비교
      if (cP == cQ && cP != cR)
        return comparePQ(i + 1, cR);
      if (cQ == cR && cP != cQ)
        return compareQR(i + 1, cP);
      if (cP == cR && cP != cQ)
        return "Hmm...";
    }
    return "Hmm...";
  }

  public static String comparePQ(int from, char biggest) {
    for (int i = from; i < N; i++) {
      char cP = P.charAt(i);
      char cQ = Q.charAt(i);
      if (cP != cQ) {
        if (cP == biggest)
          return "Hmm...";
        if (cQ == biggest)
          return "HJS! HJS! HJS!";
        return "HJS! HJS! HJS!";
      }
    }
    return "Hmm...";
  }

  public static String compareQR(int from, char smallest) {
    for (int i = from + 1; i < N; i++) {
      char cQ = Q.charAt(i);
      char cR = R.charAt(i);
      if (cQ != cR) {
        if (cR == smallest)
          return "Hmm...";
        if (cQ == smallest)
          return "HJS! HJS! HJS!";
        return "HJS! HJS! HJS!";
      }
    }
    return "Hmm...";
  }
}
