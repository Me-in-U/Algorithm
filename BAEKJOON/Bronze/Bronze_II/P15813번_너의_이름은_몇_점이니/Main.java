package P15813번_너의_이름은_몇_점이니;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String name = br.readLine();    
    int sum = 0;    
    for(int i = 0; i < N; i++){
      sum += (int)((char)name.charAt(i))-64;
    }
    System.out.println(sum);
  }
}