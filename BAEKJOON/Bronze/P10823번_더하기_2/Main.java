package P10823_더하기_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
    String line = "";
    int sum = 0;
    while ((line = br.readLine()) != null) {
      sb.append(line);
    }
    st = new StringTokenizer(sb.toString(), ",");
    while (st.hasMoreTokens()) {
      sum += Integer.parseInt(st.nextToken());
    }
    System.out.println(sum);
  }
}
