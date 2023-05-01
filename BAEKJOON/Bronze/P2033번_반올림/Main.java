import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String line = br.readLine();
    int[] nums = new int[line.length() + 1];
    for (int i = 1; i < nums.length; i++) {
      nums[i] = line.charAt(i - 1) - '0';
    }
    for (int i = nums.length - 1; i >= 1; i--) {
      if (i == 1) {
        if (nums[i - 1] == 0)
          break;
      }
      if (nums[i] >= 5) {
        nums[i - 1]++;
      }
      nums[i] = 0;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < nums.length; i++) {
      sb.append(nums[i]);
    }
    System.out.println(Integer.parseInt(sb.toString()));
  }
}