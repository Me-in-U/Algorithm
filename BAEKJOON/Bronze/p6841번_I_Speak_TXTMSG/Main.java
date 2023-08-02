package p6841번_I_Speak_TXTMSG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String line = "";
    while (true) {
      if (!(line = br.readLine()).equals("TTYL")) {
        if (line.equals("CU")) {
          sb.append("see you").append('\n');
        } else if (line.equals(":-)")) {
          sb.append("I\u2019m happy").append('\n');
        } else if (line.equals(":-(")) {
          sb.append("I\u2019m unhappy").append('\n');
        } else if (line.equals(";-)")) {
          sb.append("wink").append('\n');
        } else if (line.equals(":-P")) {
          sb.append("stick out my tongue").append('\n');
        } else if (line.equals("(~.~)")) {
          sb.append("sleepy").append('\n');
        } else if (line.equals("TA")) {
          sb.append("totally awesome").append('\n');
        } else if (line.equals("CCC")) {
          sb.append("Canadian Computing Competition").append('\n');
        } else if (line.equals("CUZ")) {
          sb.append("because").append('\n');
        } else if (line.equals("TY")) {
          sb.append("thank-you").append('\n');
        } else if (line.equals("YW")) {
          sb.append("you\u2019re welcome").append('\n');
        } else {
          sb.append(line).append('\n');
        }
      } else {
        sb.append("talk to you later").append('\n');
        System.out.print(sb.toString());
        break;
      }
    }
  }
}