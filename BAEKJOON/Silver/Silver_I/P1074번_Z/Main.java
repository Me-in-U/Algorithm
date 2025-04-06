package BAEKJOON.Silver.Silver_I.P1074번_Z;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int count = 0;
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    //입력
    //N이 주어졌을 때, r행 c열을 몇 번째로 방문하는지 출력하는 프로그램을 작성하시오.
    //1 ≤ N ≤ 15
    //0 ≤ r, c < 2 POW N
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int r = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    int side = (int)Math.pow(2, N);
    find(side, r, c);
    System.out.println(count);
	}
  public static void find(int side, int r, int c){
    if(side == 1){
      return;
    }
    int half_side = side / 2;
    int quarter = (side * side) / 4;
    
    //찾으려는 수가 반의 상, 좌에 있을 때
    if(r < half_side && c < half_side) {
			find(half_side, r, c);
		}//찾으려는 수가 반의 상, 우에 있을 때
		else if(r < half_side && c >= half_side) {
			count += quarter * 1;
			find(half_side, r, c - half_side);
		}//찾으려는 수가 반의 하, 좌에 있을 때
		else if(r >= half_side && c < half_side) {
			count += quarter * 2;
			find(half_side, r - half_side, c);
		}//찾으려는 수가 반의 하, 우에 있을 때
		else {
			count += quarter * 3;
			find(half_side, r - half_side, c - half_side);
		}
  }
}