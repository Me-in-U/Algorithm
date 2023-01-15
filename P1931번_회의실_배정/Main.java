package P1931번_회의실_배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static class Time {
    private int start;
    private int end;

    public Time(int start, int end) {
      this.start = start;
      this.end = end;
    }
  }

  public static class TimeComparator implements Comparator<Time> {
    @Override
    public int compare(Time o1, Time o2) {
      if (o1.end == o2.end) {
        return o1.start - o2.start;
      } else {
        return o1.end - o2.end;
      }
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<Time> list = new ArrayList<>();
    StringTokenizer st = null;
    int result = 0;
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      list.add(new Time(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }
    Collections.sort(list, new TimeComparator());
    int lastEndTime = 0;
    for (int i = 0; i < N; i++) {
      Time time = list.get(i);
      if (lastEndTime <= time.start) {
        lastEndTime = time.end;
        result++;
      }
    }
    System.out.println(result);
  }
}