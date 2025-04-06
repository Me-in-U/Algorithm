package BAEKJOON.Bronze.Bronze_I.P2729번_이진수_덧셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());
      char[] a = st.nextToken().toCharArray();
      char[] b = st.nextToken().toCharArray();
      char[] ext_a = new char[81];
      char[] ext_b = new char[81];
      char[] result = new char[81];
      for (int p = 0; p < 81; p++) {
        ext_a[p] = '0';
        ext_b[p] = '0';
        result[p] = '0';
      }
      for (int k = 0; k < a.length; k++) {
        ext_a[81 - a.length + k] = a[k];
      }
      for (int k = 0; k < b.length; k++) {
        ext_b[81 - b.length + k] = b[k];
      }
      boolean carry = false;
      for (int k = 80; k >= 0; k--) {
        // 0,1 혹은 1,0
        if (ext_a[k] != ext_b[k]) {
          if (carry) {
            result[k] = '0';
            carry = true;
          } else {
            result[k] = '1';
          }
        }
        // 1,1
        else if (ext_a[k] == '1' && ext_b[k] == '1') {
          if (carry) {
            result[k] = '1';
          } else {
            result[k] = '0';
            carry = true;
          }
        }
        // 0,0
        else {
          if (carry) {
            result[k] = '1';
            carry = false;
          }
        }
      }
      StringBuilder sb = new StringBuilder();
      boolean startPrint = false;
      for (int p = 0; p < result.length; p++) {
        if (!startPrint) {
          if (result[p] == '1') {
            startPrint = true;
          }
        }
        if (startPrint) {
          sb.append(result[p]);
        }
      }
      if (startPrint) {
        System.out.println(sb.toString());
      } else {
        System.out.println('0');
      }
    }
  }
}
