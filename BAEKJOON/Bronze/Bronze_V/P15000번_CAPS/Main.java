package BAEKJOON.Bronze.Bronze_V.P15000번_CAPS;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
  public static void main(String[] args) throws IOException {
    InputStream in = System.in;
    OutputStream out = System.out;
    byte[] buffer = new byte[1 << 20];
    int bytesRead;

    while ((bytesRead = in.read(buffer)) != -1) {
      for (int i = 0; i < bytesRead; i++) {
        byte b = buffer[i];
        if (b >= 'a' && b <= 'z') {
          buffer[i] = (byte) (b - ('a' - 'A'));
        }
      }
      out.write(buffer, 0, bytesRead);
    }
    out.flush();
  }
}
