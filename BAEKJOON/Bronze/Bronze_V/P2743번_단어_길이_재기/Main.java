package BAEKJOON.Bronze.Bronze_V.P2743번_단어_길이_재기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String a = br.readLine();
    bw.write(String.valueOf(a.length()));
    bw.newLine();
    bw.flush();
  }
}