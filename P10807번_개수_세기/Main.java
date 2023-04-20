package P10807번_개수_세기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String[] nums = br.readLine().split(" ");
    int v = Integer.parseInt(br.readLine());
    int count = 0;
    for (int i = 0; i < N; i++) {
      if (Integer.parseInt(nums[i]) == v) {
        count++;
      }
    }
    System.out.println(count);
  }
}