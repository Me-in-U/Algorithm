package P1158번_요세푸스_문제;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]);
    int K = Integer.parseInt(input[1]) - 1;
    ArrayList<Integer> numList = new ArrayList<>();
    for (int i = 1; i <= N; i++)
      numList.add(i);
    int index = 0;
    StringBuilder sb = new StringBuilder();
    sb.append('<');
    for (int i = 0; i < N - 1; i++) {
      index = (index + K) % numList.size();
      sb.append(numList.remove(index)).append(", ");
    }
    sb.append(numList.get(0)).append('>');
    System.out.println(sb.toString());
  }
}
