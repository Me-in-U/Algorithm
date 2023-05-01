package P2902번_KMP는_왜_KMP일까;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringBuilder sb = new StringBuilder();
    String input = br.readLine();
    StringTokenizer st = new StringTokenizer(input, "-");
    while(st.hasMoreTokens()){
      String get = st.nextToken();
      sb.append(get.charAt(0));
    }
    System.out.println(sb);
  }
}