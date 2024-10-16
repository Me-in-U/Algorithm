package P28445번_알록달록_앵무새;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<String> colors = new ArrayList<>();
    for (int i = 0; i < 1; i++) {
      Set<String> colors_temp = new HashSet<>();
      for (int j = 0; j < 2; j++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        colors_temp.add(st.nextToken());
        colors_temp.add(st.nextToken());
      }
      colors.addAll(colors_temp);
    }
    List<String> combination = new LinkedList<>();
    for (int i = 0; i < colors.size(); i++) {
      StringBuilder sb = null;
      for (int j = 0; j < colors.size(); j++) {
        sb = new StringBuilder();
        sb.append(colors.get(i)).append(" ").append(colors.get(j));
        combination.add(sb.toString());
      }
    }
    Collections.sort(combination, Comparable::compareTo);
    String result = combination.toString();
    result = result.substring(1, result.length() - 1).replace(", ", "\n");
    System.out.println(result);
  }
}