package P28097번_모범생_포닉스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String[] time = br.readLine().split(" ");
    int totalTime = 0;
    for (int i = 0; i < N; i++) {
      totalTime += Integer.parseInt(time[i]);
    }
    totalTime += (8 * (N - 1));
    int day = totalTime / 24;
    int hour = totalTime % 24;
    System.out.println(day + " " + hour);
  }
}