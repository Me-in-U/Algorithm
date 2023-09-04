package P2822번_점수_계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
  public static class Score_class {
    int score = 0;
    int order = 0;

    public Score_class(int score, int order) {
      this.score = score;
      this.order = order;
    }
  }

  public static class Score_class_Comparator implements Comparator<Score_class> {
    @Override
    public int compare(Score_class o1, Score_class o2) {
      return o2.score - o1.score;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<Score_class> list = new ArrayList<>();
    for (int i = 1; i <= 8; i++) {
      list.add(new Score_class(Integer.parseInt(br.readLine()), i));
      Collections.sort(list, new Score_class_Comparator());
    }
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int sum = 0;
    for (int i = 0; i < 5; i++) {
      sum += list.get(i).score;
      pq.add(list.get(i).order);
    }
    System.out.println(sum);
    for (int i = 0; i < 5; i++) {
      System.out.print(pq.poll() + " ");
    }
  }
}