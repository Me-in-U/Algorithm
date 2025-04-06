package BAEKJOON.Bronze.Bronze_II.P10420번_기념일;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static int p_yaer[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  public static int y_yaer[] = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  public static int Y = 2014;
  public static int M = 4;
  public static int D = 1;

  public static int N;
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    

		N = Integer.parseInt(br.readLine());
    while(N != 0){
      boolean pyeong = true;
      if(Y % 4 == 0 && Y % 100 != 0){
        pyeong = false;
      }
      
      if(pyeong){
        if(N > p_yaer[M])
          p_cal();
        else{
          day();
        }
      }
      else{
        if(N > y_yaer[M])
          y_cal();
        else{
          day();
        }
      }
    
    }

    //출력
    print();
	}
  public static void day(){
    D += N;
    N = 0;
  }
  public static void p_cal(){
    int prev_days = 0;
    int days = 0;
    for(int i = M; i <= 12; i++){
      days += p_yaer[i];
      if(days > N){
        N -= prev_days;
        M = i;
        break;
      }
      else{
        prev_days += p_yaer[i];
        if(i == 12){
          Y++;
          M = 1;
          N -= prev_days;
        }
      }
    }
  }
  public static void y_cal(){
    int prev_days = 0;
    int days = 0;
    for(int i = M; i <= 12; i++){
      days += y_yaer[i];
      if(days > N){
        N -= prev_days;
        M = i;
        break;
      }
      else{
        prev_days += y_yaer[i];
        if(i == 12){
          Y++;
          M = 1;
          N -= prev_days;
        }
      }
    }
  }
  public static void print(){
    if(M < 10 && D < 10){
      String str_M = "0" + M;
      String str_D = "0" + D;
      System.out.println(Y+ "-" + str_M + "-" + str_D);
    }
    else if(M < 10 && D >= 10){
      String str_M = "0" + M;
      System.out.println(Y+ "-" + str_M + "-" + D);
    }
    else if(M >= 10 && D < 10){
      String str_D = "0" + D;
      System.out.println(Y+ "-" + M + "-" + str_D);
    }
    else
      System.out.println(Y+ "-" + M + "-" + D);
  }
}