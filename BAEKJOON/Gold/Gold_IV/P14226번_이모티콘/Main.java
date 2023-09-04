package P14226번_이모티콘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int S = Integer.parseInt(br.readLine());
    // !{screen, clipboard, time}
    Queue<int[]> q = new LinkedList<>();
    q.add(new int[] { 1, 0, 0 });
    boolean[][] count = new boolean[S + 1][S + 1];
    int screen = 0;
    int clipboard = 0;
    int time = 0;
    while (true) {
      int[] data = q.poll();
      screen = data[0];
      clipboard = data[1];
      time = data[2];
      if (screen == S) {
        System.out.println(time);
        break;
      }
      // !복사
      if (screen <= 500 && !count[screen][screen]) {
        q.add(new int[] { screen, screen, time + 1 });
      }
      // !붙여넣기
      if (clipboard != 0 && screen + clipboard <= S) {
        if (!count[screen + clipboard][clipboard]) {
          count[screen + clipboard][clipboard] = true;
          q.add(new int[] { screen + clipboard, clipboard, time + 1 });
        }
      }
      // !하나 삭제
      if (screen > 1 && !count[screen - 1][clipboard]) {
        count[screen - 1][clipboard] = true;
        q.add(new int[] { screen - 1, clipboard, time + 1 });
      }
    }
  }
}