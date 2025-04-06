package BAEKJOON.Silver.Silver_V.P25206번_너의_평점은;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

      double 학점총합 = 0.0d;
      double 학점곱과목평점 = 0.0d;
		for(int i = 0; i < 20; i++){
         st = new StringTokenizer(br.readLine());
         st.nextToken();
         double f = Double.parseDouble(st.nextToken());
         String str = st.nextToken();
         if(str.equals("A+")){
            학점총합 += f;
            학점곱과목평점 += (f * 4.5d);
         }
         else if(str.equals("A0")){
            학점총합 += f;
            학점곱과목평점 += (f * 4.0d);
         }
         else if(str.equals("B+")){
            학점총합 += f;
            학점곱과목평점 += (f * 3.5d);
         }
         else if(str.equals("B0")){
            학점총합 += f;
            학점곱과목평점 += (f * 3.0d);
         }
         else if(str.equals("C+")){
            학점총합 += f;
            학점곱과목평점 += (f * 2.5d);
         }
         else if(str.equals("C0")){
            학점총합 += f;
            학점곱과목평점 += (f * 2.0d);
         }
         else if(str.equals("D+")){
            학점총합 += f;
            학점곱과목평점 += (f * 1.5d);
         }
         else if(str.equals("D0")){
            학점총합 += f;
            학점곱과목평점 += (f * 1.0d);
         }
         else if(str.equals("F")){
            학점총합 += f;
            학점곱과목평점 += (f * 0.0d);
         }
         else if(str.equals("P")){

         }
		}
      double result = 학점곱과목평점/학점총합;
      System.out.println(String.format("%.6f", result));
	}
}
