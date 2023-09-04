package P1978번_소수_찾기;

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
    
    int N = Integer.parseInt(br.readLine());
    int nums[] = new int[N];
    String input = br.readLine();
    StringTokenizer st = null;
    st = new StringTokenizer(input, " ");
    for(int i = 0; i< N; i++)
      nums[i] = Integer.parseInt(st.nextToken());
    int not_prime = 0;
    for(int i = 0; i< N; i++){
      if(nums[i]==1){
          not_prime++;
      }
      for(int j = 2; j< nums[i]; j++){
        if (nums[i]%j ==0){
          not_prime++;
          break;
        }
      }
    }
    bw.write(String.valueOf(N-not_prime));
    bw.newLine();
    bw.flush();
  }
}
