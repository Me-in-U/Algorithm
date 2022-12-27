package P10825번_국영수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Person implements Comparable<Person> {
  public String name;
  public int kor;
  public int eng;
  public int math;

  public Person(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  @Override
  public int compareTo(Person other) {
    if (this.kor == other.kor && this.eng == other.eng && this.math == other.math) {
      return this.name.compareTo(other.name);
    } else if (this.kor == other.kor && this.eng == other.eng) {
      return other.math - this.math;
    } else if (this.kor == other.kor) {
      return this.eng - other.eng;
    } else {
      return other.kor - this.kor;
    }
  }
}

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    int N = Integer.parseInt(br.readLine());
    Person[] persons = new Person[N];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      persons[i] = new Person(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
          Integer.parseInt(st.nextToken()));
    }
    Arrays.sort(persons);
    for (int i = 0; i < N; i++) {
      System.out.println(persons[i].name);
    }
  }
}
