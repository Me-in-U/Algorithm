package BAEKJOON.Silver.Silver_III.P13915번_현수의_열기구;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //처음 N 입력
    String input= br.readLine();
    while(true) {
      HashSet<String> set = new HashSet<>();
      int N = Integer.parseInt(input);
      for(int i = 0; i < N; i++) {
        boolean[] balloon = new boolean[10];
        String student_num = br.readLine();
        for(int k = 0; k < student_num.length(); k++) {
          balloon[student_num.charAt(k) - '0'] = true;
        }
        String add_str = "";
        for(int n = 1; n <= 9; n++){
          if(balloon[n]){
            add_str = add_str.concat(Integer.toString(n));
          }
        }
        set.add(add_str);
      }
      System.out.println(set.size());

      //이후 N 입력
      input= br.readLine();
      if(input == null){
        break;
      }
    }
	}
}