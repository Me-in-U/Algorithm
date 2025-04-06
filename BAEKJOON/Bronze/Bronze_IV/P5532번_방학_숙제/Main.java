package BAEKJOON.Bronze.Bronze_IV.P5532번_방학_숙제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int L = Integer.parseInt(br.readLine());
    double A = Integer.parseInt(br.readLine());
    double B = Integer.parseInt(br.readLine());
    double C = Integer.parseInt(br.readLine());
    double D = Integer.parseInt(br.readLine());

    int math = (int) Math.ceil(B / D);
    int lang = (int) Math.ceil(A / C);

    System.out.println(L - Math.max(math, lang));
  }
}