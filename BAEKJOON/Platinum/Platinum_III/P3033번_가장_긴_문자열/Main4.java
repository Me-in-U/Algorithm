package Platinum_III.P3033번_가장_긴_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class Main4 {
  static long[] MOD = { 1_000_000_007, 1_000_000_009 };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int length = Integer.parseInt(br.readLine());
    String str = br.readLine();
    int maxLength = length - 1;
    while (maxLength > 0) {
      System.out.println(maxLength);
      Map<Long, HashSet<String>> map = new HashMap<>();
      long hash = 0;
      int power = 1;
      for (int i = 0; i <= length - maxLength; i++) {
        if (i == 0) {
          // 뒤부터 각 문자의 해시값을 구하여 합산한다
          for (int j = maxLength - 1; j >= 0; j--) {
            hash += (str.charAt(j) * power);
            power *= 2;
          }
          power /= 2;
          map.put(hash, new HashSet<>());
          map.get(hash).add(str.substring(0, maxLength));
          System.out.println(str.substring(0, maxLength) + " " + hash);
        } else {
          long removeValue = (str.charAt(i - 1) * power); // 맨앞
          long newValue = (str.charAt(i - 1 + maxLength)); // 맨뒤
          long newHash = (2 * (hash - removeValue) + newValue); // 2를 곱해서 우측으로 전체 이동
          if (!map.containsKey(newHash)) {
            map.put(newHash, new HashSet<>());
            System.out.println("새로 추가");
          } else {
            if (map.get(newHash).contains(str.substring(i, i + maxLength))) {
              sb.append(maxLength);
              System.out.println("발견");
              System.out.println(str.substring(i, i + maxLength) + " " + newHash);
              maxLength = 0;
              break;
            }
          }
          map.get(newHash).add(str.substring(i, i + maxLength));
          System.out.println(str.substring(i, i + maxLength) + " " + newHash);
        }
      }
      maxLength--;
    }
    System.out.print(sb.toString());
  }

}