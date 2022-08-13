package P2869번_달팽이는_올라가고_싶다;

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
    String input = br.readLine();
    StringTokenizer st = null;
		st = new StringTokenizer(input, " ");
    double A = Integer.parseInt(st.nextToken());
    double B = Integer.parseInt(st.nextToken());
    double V = Integer.parseInt(st.nextToken());
    int day = (int)Math.ceil((V-A)/(A-B))+1;
    bw.write(String.valueOf(day));
    bw.flush();
    br.close();
  }
}