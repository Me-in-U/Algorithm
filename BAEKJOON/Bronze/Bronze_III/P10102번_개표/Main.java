package P10102번_개표;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int V = Integer.parseInt(br.readLine());
    String input = br.readLine();
    int A = 0;
    for (int i = 0; i < V; i++)
      if (input.charAt(i) == 'A')
        A++;
    if (A == V - A)
      System.out.println("Tie");
    else
      System.out.println(A > V - A ? "A" : "B");
  }
}