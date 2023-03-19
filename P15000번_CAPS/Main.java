package P15000번_CAPS;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PushbackInputStream;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    PushbackInputStream input = new PushbackInputStream(System.in);
    int token = input.read();
    while (97 <= token && token <= 122) {
      bw.write((char) (token - 32));
      token = input.read();
    }
    bw.flush();
    bw.close();
  }
}