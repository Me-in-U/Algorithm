package P6749번_Next_in_line;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int Y = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());
    bw.write(String.valueOf(M + (M - Y)));
    bw.newLine();
    bw.flush();
  }
}
