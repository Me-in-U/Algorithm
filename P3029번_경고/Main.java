package P3029번_경고;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    st = new StringTokenizer(br.readLine(), ":");
    int hh_1 = Integer.parseInt(st.nextToken());
    int mm_1 = Integer.parseInt(st.nextToken());
    int ss_1 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine(), ":");
    int hh_2 = Integer.parseInt(st.nextToken());
    int mm_2 = Integer.parseInt(st.nextToken());
    int ss_2 = Integer.parseInt(st.nextToken());

    int hh = 0;
    int mm = 0;
    int ss = 0;

    // 같을때 24시간 더하기
    if (hh_1 == hh_2 && mm_1 == mm_2 && ss_1 == ss_2) {
      hh = 24;
    } else {
      // 초계산
      if (ss_1 <= ss_2) {
        ss = ss_2 - ss_1;
      } else {
        ss = (60 - ss_1) + ss_2;
        mm_1 += 1;
      }
      // 분계산
      if (mm_1 <= mm_2) {
        mm = mm_2 - mm_1;
      } else {
        mm = (60 - mm_1) + mm_2;
        hh_1 += 1;
      }
      // 시계산
      if (hh_1 >= 25) {
        hh_1 = 24;
        hh_2--;
      }
      if (hh_1 <= hh_2) {
        hh = hh_2 - hh_1;
      } else {
        hh = (24 - hh_1) + hh_2;
      }
    }
    // 출력
    if (hh < 10) {
      System.out.print("0" + hh + ":");
    } else {
      System.out.print(hh + ":");
    }
    if (mm < 10) {
      System.out.print("0" + mm + ":");
    } else {
      System.out.print(mm + ":");
    }
    if (ss < 10) {
      System.out.println("0" + ss);
    } else {
      System.out.println(ss);
    }
  }
}