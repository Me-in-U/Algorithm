package B번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
  static class People {
    int count;
    int year;
    String name;

    People(int count, int year, String name) {
      this.count = count;
      this.year = year;
      this.name = name;
    }
  }

  public static class YearComp implements Comparator<People> {
    @Override
    public int compare(People s1, People s2) {
      return s1.year % 100 - s2.year % 100;
    }
  }

  public static class CountComp implements Comparator<People> {
    @Override
    public int compare(People s1, People s2) {
      return s1.count - s2.count;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    ArrayList<People> people = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      String[] input = br.readLine().split(" ");
      people.add(new People(Integer.parseInt(input[0]), Integer.parseInt(input[1]), input[2]));
    }
    Collections.sort(people, new YearComp());
    sb.append(people.get(0).year % 100).append(people.get(1).year % 100).append(people.get(2).year % 100).append('\n');
    Collections.sort(people, new CountComp());
    sb.append(people.get(2).name.charAt(0)).append(people.get(1).name.charAt(0)).append(people.get(0).name.charAt(0))
        .append('\n');
    System.out.print(sb.toString());
  }
}