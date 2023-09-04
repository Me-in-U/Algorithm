package P14719번_빗물;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
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
    for(int h = 0; h < H; h++){
      for(int w = 0; w < W; w++){
        if(world[h][w]){          
          int next = 1;
          int water_count = 0;
          while((w + next) != W){
            //다음칸이 T이면 +=빗물 수, 다음칸 시작은 마지막 T로 지정
            if(world[h][w + next]){
              sum += water_count;
              //다음 칸 j 지정
              //마지막 T가 마지막 index이면 w = W 하여 2번째 for 탈출
              if((w + next) == W-1)
                w = W;              
              else
                w += next - 1;
              //while탈출
              break;
            }
            //다음칸이 F이면 빗물++, 다음칸으로
            else{
              water_count++;
              next++;
            }
          }
        }
      }
    }
    System.out.println(sum);
	}
}