package P4101번_크냐;

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

    StringTokenizer st = null;
    for(;;){
      st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());
      if (N==0&&M==0) {
        break;
      }
      else if (N>M) {
        bw.write("Yes");
        bw.newLine();
      }
      else {
        bw.write("No");
       bw.newLine();
      }
    }
    bw.flush();
  }
}