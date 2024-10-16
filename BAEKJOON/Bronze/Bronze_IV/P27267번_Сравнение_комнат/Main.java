package P27267번_Сравнение_комнат;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int Machine = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
    int Petina = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
    if (Machine > Petina) {
      System.out.println("M");
    } else if (Machine < Petina) {
      System.out.println("P");
    } else {
      System.out.println("E");
    }
  }
}