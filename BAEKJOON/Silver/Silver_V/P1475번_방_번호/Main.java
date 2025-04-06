package BAEKJOON.Silver.Silver_V.P1475번_방_번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String N = br.readLine();
    int count[] = new int[10];
    for(int i = 0; i < N.length(); i++)
      count[N.charAt(i) - 48]++;
    
    int sn = 0;
    if((count[6] + count[9]) % 2 > 0)
      sn = ((count[6] + count[9]) / 2) + 1;
    else
      sn = ((count[6] + count[9]) / 2);

    int max = 0;
    for(int i = 0; i < 10; i++){
      if(count[i]> max)
        if((i == 6) || (i == 9))
          continue;
        else
          max = count[i];
    }
    
    if(max > sn)
      System.out.println(max);
    else
      System.out.println(sn);
  }
}