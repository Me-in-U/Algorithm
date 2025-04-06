package BAEKJOON.Bronze.Bronze_V.P16099번_Larger_Sport_Facility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    for (int i = 0; i < N; i++) {
      String[] input = br.readLine().split(" ");
      BigInteger lt = new BigInteger(input[0]);
      BigInteger lw = new BigInteger(input[1]);
      BigInteger te = new BigInteger(input[2]);
      BigInteger tw = new BigInteger(input[3]);
      BigInteger TelecomParisTech = lt.multiply(lw);
      BigInteger Eurecom = te.multiply(tw);
      int compare = TelecomParisTech.compareTo(Eurecom);
      if (compare == 1) {
        System.out.println("TelecomParisTech");
      } else if (compare == -1) {
        System.out.println("Eurecom");
      } else {
        System.out.println("Tie");
      }
    }
  }
}