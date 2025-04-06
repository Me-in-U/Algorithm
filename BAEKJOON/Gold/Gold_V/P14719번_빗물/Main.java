package BAEKJOON.Gold.Gold_V.P14719번_빗물;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main_debug {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    
    st = new StringTokenizer(br.readLine());
    int H = Integer.parseInt(st.nextToken());
    int W = Integer.parseInt(st.nextToken());
    boolean world[][] = new boolean[H][W];

    //배열 생성 블록이 있으면 => True
    st = new StringTokenizer(br.readLine());
		for(int i = 0; i < W; i++){
      int build = Integer.parseInt(st.nextToken());
      int level = H - 1;
      for(int k = 0; k < build; k++){
        world[level][i] = true;
        level--;
      }
      level = H - 1;
		}

    int sum = 0;
    for(int i = 0; i < H; i++){
      for(int j = 0; j < W; j++){
        if(world[i][j]){          
          int next = 1;
          int water_count = 0;
          while((j + next) != W){
            //다음칸이 T이면 +=빗물 수, 다음칸 시작은 마지막 T로 지정
            if(world[i][j + next]){
              sum += water_count;
              System.out.print("                   ");
              System.out.print("T("+(i+1)+", "+(j+1)+")");
              System.out.print("~ T("+(i+1)+", "+(j+1+next)+")");
              System.out.println();
              //다음 칸 j 지정
              //마지막 T가 마지막 index이면 j = w 하여 2번째 for 탈출
              if((j + next) == W-1)
                j = W;              
              else
                j += next - 1;
              
              break;
            }
            //다음칸이 F이면 빗물++, 다음칸으로
            else{
              System.out.print("("+(i+1)+", "+(j+1+next)+")");
              water_count++;
              next++;
            }
          }
          if((j + next) >= W){
            System.out.print("                   ");
            System.out.print("T("+(i+1)+", "+(j+1)+")");
            System.out.print("~ out of bounds");
            System.out.println();
          }
        }
      }
    }
    System.out.println("Sum: " + sum);


    for(int i = 0; i < H; i++){
      for(int j = 0; j < W; j++) {
        if(world[i][j]){
          System.out.print("■");
        }
        else{
          System.out.print("□");
        }
      }
      System.out.println();
    }
	}
}