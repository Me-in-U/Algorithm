package 기1행.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Set<String> names = new HashSet<>();
    Set<String> eyewitness = new HashSet<>();
    // !입력
    br.readLine();
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++)
      names.add(br.readLine());
    int M = Integer.parseInt(br.readLine());
    for (int i = 0; i < M; i++)
      eyewitness.add(br.readLine());
    // !출력
    // 사건 당시에 dongho가 집에 존재했을 경우, 목격담에 관계없이 dongho가 범인이다.
    if (names.contains("dongho")) {
      System.out.println("dongho");
    } // 집에 있던 사람 중 목격담이 없는 사람이 단 한 명일 경우, 소거법에 의해 당연히 그 사람이 범인이다.
    else if (N - 1 == eyewitness.size()) {
      for (String name : names) {
        if (!eyewitness.contains(name)) {
          System.out.println(name);
          break;
        }
      }
    } // 목격담이 없는, 이름이 bumin인 사람이 집에 있었다면, 그 사람이 범인이다.
    else if (names.contains("bumin") && !eyewitness.contains("bumin")) {
      System.out.println("bumin");
    }
    // 목격담이 없는, 이름이 cake인 사람이 집에 있었다면,
    // 케이크는 거짓말이기 때문에 (The cake is a lie) 그 사람이 범인이다.
    else if (names.contains("cake") && !eyewitness.contains("cake")) {
      System.out.println("cake");
    } // 목격담이 없는, 이름이 lawyer인 사람이 집에 있었다면, 변호사는 항상 범인이기 때문에 그 사람이 범인이다.
    else if (names.contains("lawyer") && !eyewitness.contains("lawyer")) {
      System.out.println("lawyer");
    } else {
      // 빠르면 케이크를 몰래 먹기 쉽기 때문에, 집에 있던 시이가 아닌
      // N명의 사람들 중, 목격담이 없고 사전순으로 가장 이름이 빠른 사람이 범인이다.
      List<String> sortedNames = new ArrayList<>(names);
      Collections.sort(sortedNames);
      for (String name : sortedNames) {
        if (!eyewitness.contains(name)) {
          System.out.println(name);
          break;
        }
      }
    }
  }
}
