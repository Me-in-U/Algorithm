package BAEKJOON.Gold.Gold_V.P28018번_시간이_겹칠까;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  static class Student implements Comparable<Student> {
    int S;
    int E;

    Student(int S, int E) {
      this.S = S;
      this.E = E;
    }

    @Override
    public int compareTo(Student o) {
      return this.S - o.S;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    // !학생 수 N
    int N = Integer.parseInt(br.readLine());
    Student[] students = new Student[N];
    // !N개 줄 : 배정 시각 S, 종료 시각 E
    for (int i = 0; i < N; i++) {
      String[] input = br.readLine().split(" ");
      int S = Integer.parseInt(input[0]);
      int E = Integer.parseInt(input[1]);
      students[i] = new Student(S, E);
    }
    Arrays.sort(students);
    // !특정한 시각의 개수 Q
    int Qcount = Integer.parseInt(br.readLine());
    // !알고자 하는 특정 시각Q개
    int[] Qs = new int[Qcount];
    String[] QData = br.readLine().split(" ");
    for (int i = 0; i < Qcount; i++) {
      Qs[i] = Integer.parseInt(QData[i]);
    }
    // !계산
    for (int i = 0; i < Qcount; i++) {
      int Q = Qs[i];
      int left = 0;
      int right = N - 1;
      int mid = 0;
      while (left <= right) {
        mid = (left + right) / 2;
        if (students[mid].S <= Q && Q <= students[mid].E) {
          break;
        } else if (students[mid].E < Q) {
          left = mid + 1;
        } else if (students[mid].S >= Q) {
          right = mid - 1;
        }
      }
      int count = 0;
      for (int j = mid; j < N; j++) {
        if (students[j].S <= Q && Q <= students[j].E) {
          count++;
        } else if (students[j].S > Q) {
          break;
        }
      }
      sb.append(count).append('\n');
    }
    System.out.print(sb.toString());
  }
}