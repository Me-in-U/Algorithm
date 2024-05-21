package BAEKJOON.Silver.Silver_III.P29813번_최애의_팀원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static class Student {
    String name;
    int X;

    Student(String name, int X) {
      this.name = name;
      this.X = X;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = null;
    List<Student> students = new LinkedList<>();
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      students.add(new Student(st.nextToken(), Integer.parseInt(st.nextToken())));
    }
    while (students.size() != 1) {
      Student mate1 = students.remove(0);
      int mate2 = (mate1.X - 1) % students.size();
      // System.out.println(mate1.name + " " + students.get(mate2).name);
      students.remove(mate2);
      for (int i = 0; i < mate2; i++) {
        students.add(students.remove(0));
      }
    }
    System.out.println(students.get(0).name);
  }
}