package BAEKJOON.Bronze.Bronze_IV.P30319번_Advanced_to_Taoyuan_Regional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
  public static void main(String[] args) throws IOException, ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Date deadline = sdf.parse("2023-09-17");
    Date input = sdf.parse(br.readLine());
    System.out.println(input.before(deadline) ? "GOOD" : "TOO LATE");
  }
}