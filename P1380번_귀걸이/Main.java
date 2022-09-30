package P1380번_귀걸이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int scene = 1;
    StringBuilder sb = new StringBuilder();
    while(true){
      int n = Integer.parseInt(br.readLine());
      if(n == 0){
        break;
      }
      else{
        String[] name = new String[101];
        for(int i = 1; i <= n; i++){
          name[i] = br.readLine();
        }
        int[] call = new int[101];
        for(int i = 1; i <= 2 * n - 1; i++){
          String data = br.readLine();
          int a = (data.charAt(0) - '0');
          call[a]++;
        }
        sb.append(scene+" ");
        for(int i = 1; i <= n; i++){
          if(call[i] == 1){
            sb.append(name[i]).append('\n');
            break;
          }
        }
        scene++;
      }
    }
    System.out.print(sb.toString());
	}
}