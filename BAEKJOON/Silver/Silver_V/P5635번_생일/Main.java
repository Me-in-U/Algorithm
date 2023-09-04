package P5635번_생일;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue<Person> pq = new PriorityQueue<Person>();
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      String[] input = br.readLine().split(" ");
      pq.add(new Person(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]), Integer.parseInt(input[3])));
    }
    System.out.println(pq.remove().name);
    while (pq.size() > 1) {
      pq.remove();
    }
    System.out.println(pq.remove().name);
  }

  static class Person implements Comparable<Person> {
    String name;
    int day;
    int month;
    int year;

    Person(String name, int day, int month, int year) {
      this.name = name;
      this.day = day;
      this.month = month;
      this.year = year;
    }

    @Override
    public int compareTo(Person o) {
      int compareYear = o.year - this.year;
      if (compareYear != 0) {
        return compareYear;
      } else {
        int compareMonth = o.month - this.month;
        if (compareMonth != 0) {
          return compareMonth;
        } else {
          return o.day - this.day;
        }
      }
    }
  }
}