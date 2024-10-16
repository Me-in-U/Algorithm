package P3053번_택시_기하학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int r = Integer.parseInt(br.readLine());
    System.out.println(r * r * Math.PI);
    System.out.println(r * r * 2);
  }
}