package P11557번_Yangjojang_of_The_Year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static class School {
    private String name;
    private int alcohol;

    public School(String name, int alcohol) {
      this.name = name;
      this.alcohol = alcohol;
    }
  }

  public static class SchoolComparator implements Comparator<School> {
    @Override
    public int compare(School o1, School o2) {
      return o1.alcohol - o2.alcohol;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      List<School> list = new ArrayList<>();
      int N = Integer.parseInt(br.readLine());
      for (int j = 0; j < N; j++) {
        st = new StringTokenizer(br.readLine());
        list.add(new School(st.nextToken(), Integer.parseInt(st.nextToken())));
      }
      Collections.sort(list, new SchoolComparator());
      sb.append(list.get(list.size() - 1).name).append('\n');
    }
    System.out.print(sb.toString());
  }
}