package C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int H = Integer.parseInt(st.nextToken());
    String yongmeak_data = br.readLine();
    int[] yongmeak = new int[N];
    for (int i = 0; i < N; i++) {
      char c = yongmeak_data.charAt(i);
      if (c == 'S') {
        yongmeak[i] = 0;
      } else if (c == 'R') {
        yongmeak[i] = 1;
      } else {
        yongmeak[i] = 2;
      }
    }
    int[] HP = new int[N];
    Arrays.fill(HP, H);
    // S=0, R=1, W=2
    int[] spirit_pos = new int[3];
    Arrays.fill(spirit_pos, -1);
    int count = 0;
    for (int pos = 0; pos < N; pos++) {
      // S=0, R=1, W=2
      int y = yongmeak[pos];// 현재위치 용맥
      if (spirit_pos[y] == -1) {// 토지령이 없으면 소환
        spirit_pos[y] = pos;
      } else {// 토지령이 어딘가 있으면 용맥변환
        // 셋 다 소환중이라면 끝
        if (spirit_pos[0] != -1 && spirit_pos[1] != -1 && spirit_pos[2] != -1) {
          count = -1;
          break;
        }
        // 없는 토지령 소환
        if (spirit_pos[0] == -1) {
          spirit_pos[0] = pos;
        } else if (spirit_pos[1] == -1) {
          spirit_pos[1] = pos;
        } else {
          spirit_pos[2] = pos;
        }
        count++;
      }
      for (int i = 0; i < 3; i++) {// 현재 소환되어 있는 모든 토지령이 그 위치에 있는 몬스터에게 데미지를 주고,
        if (spirit_pos[i] != -1) { // 체력을 1 감소시킨다.
          if (--HP[spirit_pos[i]] == 0) { // 몬스터의 체력이 0이 되었다면 그 몬스터는 처치된다.
            spirit_pos[i] = -1;
          }
        }
      }
      // System.out.println(spirit_pos[0] + " " + spirit_pos[1] + " " +
      // spirit_pos[2]);
      // for (int i = 0; i < N; i++) {
      // System.out.print(HP[i] + " ");
      // }
      // System.out.println();
    }
    // 맵의 오른쪽 끝에 도달해 이동할 용맥이 없다면 현재 토지령이 소환되어 있는 위치의 몬스터가 모두 처치되고,
    // 사냥을 끝마친다.
    for (int i = 0; i < 3; i++) {
      if (spirit_pos[i] != -1) {
        HP[spirit_pos[i]] = 0;
      }
    }
    if (count != -1) {
      // 몬스터 살아있는지 확인
      boolean alive = false;
      for (int i = 0; i < N; i++) {
        if (HP[i] != 0) {
          alive = true;
          break;
        }
      }
      System.out.println(alive ? "-1" : count);
    } else {
      System.out.println(count);
    }
  }
}
