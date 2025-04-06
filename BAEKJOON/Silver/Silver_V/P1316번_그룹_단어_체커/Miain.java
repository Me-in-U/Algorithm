package BAEKJOON.Silver.Silver_V.P1316번_그룹_단어_체커;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
      int count = 0;

		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++){
         boolean alph_arr[] = new boolean[26];
         Boolean cheak = true;
         String str = br.readLine();
         int prev = (int)str.charAt(0) - 97;

         for(int j = 0; j < str.length(); j++) {
            int at_j = (int)str.charAt(j) - 97;
            if(alph_arr[at_j] == false) 
               alph_arr[at_j] = true;            
            else if((alph_arr[at_j] == true) && (at_j != prev)) {
               cheak = false;
               break;
            }
            prev = at_j;
         }
         if(cheak == true)
            count++;
		}
      System.out.println(count);
	}
}