package BAEKJOON.Bronze.Bronze_III.P10992번_별_찍기_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static int N;
  public static StringBuilder sb;
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    sb = new StringBuilder();

    N = Integer.parseInt(br.readLine());
    first_line();
    if(N > 1){
      mid_line();
      last_line();
    }

    System.out.print(sb.toString());
	}
  public static void first_line(){
    for(int i = 0; i < N - 1; i++) {
      sb.append(" ");
    }
    sb.append("*").append('\n');
  }
  public static void mid_line(){
    for(int i = 0; i < N - 2; i++){
      for(int k = 0; k < N - 2 - i; k++){
        sb.append(" ");
      }
      sb.append("*");
      for(int k = 0; k < 1 + (2 * i); k++){
        sb.append(" ");
      }
      sb.append("*").append('\n');
    }
  }
  public static void last_line(){
    for(int i = 0; i < N * 2 - 1; i++){
      sb.append("*");
    }
    sb.append('\n');
  }
}