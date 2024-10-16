package P24860번_Counting_Antibodies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long[] vj1 = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
    long[] vj2 = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
    long[] vdj = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
    long answer = (vdj[0] * vdj[1] * vdj[2]) * (vj1[0] * vj1[1] + vj2[0] * vj2[1]);
    System.out.println(answer);
  }
}