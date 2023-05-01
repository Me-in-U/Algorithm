package P1753번_최단경로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    int V = 5;
    ArrayList<Test_list>[] list = new ArrayList[V];
    for (int i = 0; i < V; i++) {
      list[i] = new ArrayList<>();
    }
    list[0].add(new Test_list(2, 2));
    System.out.println(list[0].size());
    System.out.println(list[0].get(0).vertex);
  }

  private static class Test_list implements Comparable<Test_list> {
    int vertex;
    int weight;

    public Test_list(int vertex, int weight) {
      this.vertex = vertex;
      this.weight = weight;
    }

    @Override
    public int compareTo(Test_list o) {
      return weight - o.weight;
    }
  }
}