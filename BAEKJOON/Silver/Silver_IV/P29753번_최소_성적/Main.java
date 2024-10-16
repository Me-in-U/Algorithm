package P29753번_최소_성적;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    double X = Double.parseDouble(st.nextToken());
    int grades = 0;
    int totalCredits = 0;
    for (int i = 0; i < N - 1; i++) {
      st = new StringTokenizer(br.readLine());
      int credits = Integer.parseInt(st.nextToken());
      totalCredits += credits;
      String grade = st.nextToken();
      if (grade.equals("A+")) {
        grades += (credits * 450);
      } else if (grade.equals("A0")) {
        grades += (credits * 400);
      } else if (grade.equals("B+")) {
        grades += (credits * 350);
      } else if (grade.equals("B0")) {
        grades += (credits * 300);
      } else if (grade.equals("C+")) {
        grades += (credits * 250);
      } else if (grade.equals("C0")) {
        grades += (credits * 200);
      } else if (grade.equals("D+")) {
        grades += (credits * 150);
      } else if (grade.equals("D0")) {
        grades += (credits * 100);
      }
    }
    int lastCredits = Integer.parseInt(br.readLine());
    totalCredits += lastCredits;
    String result = "impossible";
    if (Math.floor((grades + (lastCredits * 0)) / totalCredits) / 100.0 > X) {
      result = "F";
    } else if (Math.floor((grades + (lastCredits * 100)) / totalCredits) / 100.0 > X) {
      result = "D0";
    } else if (Math.floor((grades + (lastCredits * 150)) / totalCredits) / 100.0 > X) {
      result = "D+";
    } else if (Math.floor((grades + (lastCredits * 200)) / totalCredits) / 100.0 > X) {
      result = "C0";
    } else if (Math.floor((grades + (lastCredits * 250)) / totalCredits) / 100.0 > X) {
      result = "C+";
    } else if (Math.floor((grades + (lastCredits * 300)) / totalCredits) / 100.0 > X) {
      result = "B0";
    } else if (Math.floor((grades + (lastCredits * 350)) / totalCredits) / 100.0 > X) {
      result = "B+";
    } else if (Math.floor((grades + (lastCredits * 400)) / totalCredits) / 100.0 > X) {
      result = "A0";
    } else if (Math.floor((grades + (lastCredits * 450)) / totalCredits) / 100.0 > X) {
      result = "A+";
    }
    System.out.println(result);
  }
}
