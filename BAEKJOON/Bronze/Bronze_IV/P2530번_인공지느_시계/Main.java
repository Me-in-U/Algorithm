package BAEKJOON.Bronze.Bronze_IV.P2530번_인공지느_시계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int hh = Integer.parseInt(st.nextToken());
    int mm = Integer.parseInt(st.nextToken());
    int ss = Integer.parseInt(st.nextToken());
    int add = Integer.parseInt(br.readLine());
    ss += add;
    mm += ss / 60;
    ss %= 60;
    hh += mm / 60;
    mm %= 60;
    hh %= 24;
    System.out.println(hh + " " + mm + " " + ss);
  }
}