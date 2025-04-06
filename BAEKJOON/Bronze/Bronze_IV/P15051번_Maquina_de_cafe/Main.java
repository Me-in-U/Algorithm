package BAEKJOON.Bronze.Bronze_IV.P15051번_Maquina_de_cafe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int A1 = Integer.parseInt(br.readLine());
    int A2 = Integer.parseInt(br.readLine());
    int A3 = Integer.parseInt(br.readLine());
    int andares1 = A2 * 2 + A3 * 4;
    int andares2 = A1 * 2 + A3 * 2;
    int andares3 = A1 * 4 + A2 * 2;
    if (andares1 <= andares2 && andares1 <= andares3)
      System.out.println(andares1);
    else if (andares2 <= andares1 && andares2 <= andares3)
      System.out.println(andares2);
    else
      System.out.println(andares3);
  }
}