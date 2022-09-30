package P1681_줄_세우기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

		st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int L = Integer.parseInt(st.nextToken());

    int count = 0;
    int num = 1;
    while(true){
      String num_str = Integer.toString(num);
      for(int i = 0; i < num_str.length(); i++){
        if(num_str.charAt(i) == L + 48){
          break;
        }
        if(i == num_str.length() -1){
          //System.out.println("num : " + num);
          count++;
        }
      }
      if(count == N){
        System.out.println(num);
        break;
      }
      else{
        num++;
      }
    }
  }
}
	