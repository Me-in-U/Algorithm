package P28432번_끝말잇기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<String> list = new ArrayList<>();
    Set<String> set = new HashSet<>();
    List<String> candidate = new ArrayList<>();
    int q = -1;
    // !입력
    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      String input = br.readLine();
      list.add(input);
      set.add(input);
      if (input.equals("?")) {
        q = i;
      }
    }
    int m = Integer.parseInt(br.readLine());
    for (int i = 0; i < m; i++) {
      candidate.add(br.readLine());
    }
    // !계산
    if (list.size() == 1) {
      System.out.println(candidate.get(0));
    } else {
      if (q == 0) {
        char c = list.get(1).charAt(0);
        for (int i = 0; i < m; i++) {
          String s = candidate.get(i);
          if (s.charAt(s.length() - 1) == c && !set.contains(s)) {
            System.out.println(s);
            break;
          }
        }
      } else if (q == list.size() - 1) {
        char c = list.get(q - 1).charAt(list.get(q - 1).length() - 1);
        for (int i = 0; i < m; i++) {
          String s = candidate.get(i);
          if (s.charAt(0) == c && !set.contains(s)) {
            System.out.println(s);
            break;
          }
        }
      } else {
        char before = list.get(q - 1).charAt(list.get(q - 1).length() - 1);
        char after = list.get(q + 1).charAt(0);
        for (int i = 0; i < m; i++) {
          String s = candidate.get(i);
          if (s.charAt(0) == before && s.charAt(s.length() - 1) == after && !set.contains(s)) {
            System.out.println(s);
            break;
          }
        }
      }
    }
  }
}