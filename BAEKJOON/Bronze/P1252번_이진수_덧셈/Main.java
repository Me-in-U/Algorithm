package P1252번_이진수_덧셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    String a = st.nextToken();
    String b = st.nextToken();

    BigInteger a_bin = new BigInteger(a, 2);
    BigInteger b_bin = new BigInteger(b, 2);

    BigInteger result = a_bin.add(b_bin);

    System.out.println(result.toString(2));
  }
}
