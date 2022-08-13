package P2798번_블랙잭;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int nums[] = new int[N];
    
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i< N; i++){
      nums[i] = Integer.parseInt(st.nextToken());
    }
    //System.out.println("N = " + N + ", M = " + M);
    int pos_a = 0;
    int pos_b = 1;
    int pos_c = 2;
    int sum = 300001;
    int a = 0;
    int b = 0;
    int c = 0;
    int max = 0;
    
    while(true){
      a = nums[pos_a];
      b = nums[pos_b];
      c = nums[pos_c];
      sum = a + b + c;
      if(sum == M){
        max = sum;
        //System.out.println("sum = " + sum);
        break;
      }
      else if(sum < M && sum > max){
        max = sum;
        //System.out.println("sum = " + sum);
      }
      else{
        //System.out.println("sum = " + sum);
      }
      if (pos_a == N-3 && pos_b == N-2 && pos_c == N-1){
        break;
      }
      else{
        //System.out.print("["+pos_a+", "+pos_b+", "+ pos_c+"] -> ");
        if(pos_b == N-2){
          pos_a++;
          pos_b = pos_a + 1;
          pos_c = pos_b + 1;
        }
        else if(pos_c == N-1){
          pos_b++;
          pos_c = pos_b + 1;
        }
        else{
          pos_c++;
        }
        //System.out.println("["+pos_a+", "+pos_b+", "+ pos_c+"]");
      }
    }
    bw.write(String.valueOf(max));
    bw.newLine();
    bw.flush();
  }
}