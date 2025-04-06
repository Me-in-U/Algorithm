package BAEKJOON.Silver.Silver_I.P29754번_세상에는_많은_유튜버가-있고_그중에서_버츄얼_유튜버도_존재한다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  public static class UTUBER {
    String name;
    long liveTime;

    UTUBER(String name, long liveTime) {
      this.name = name;
      this.liveTime = liveTime;
    }
  }

  public static class Calendar {
    List<UTUBER> list;

    Calendar() {
      this.list = new ArrayList<>();
    }

    public void addUTUBER(UTUBER u) {
      list.add(u);
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    Calendar[] cal = new Calendar[M + 1];
    for (int i = 0; i <= M; i++) {
      cal[i] = new Calendar();
    }
    try {
      for (int i = 0; i < N; i++) {
        st = new StringTokenizer(br.readLine());
        String name = st.nextToken();
        int day = Integer.parseInt(st.nextToken());
        Date startTime = sdf.parse(st.nextToken());
        Date endTime = sdf.parse(st.nextToken());
        long differenceInMilliseconds = endTime.getTime() - startTime.getTime();
        long differenceInMinutes = differenceInMilliseconds / (60 * 1000);
        cal[day].addUTUBER(new UTUBER(name, differenceInMinutes));
      }
    } catch (ParseException e) {
      e.printStackTrace();
      return;
    }
    Set<String> notVTUBER = new HashSet<>();
    Map<String, Integer> nameLiveCountWeek = new HashMap<>();
    for (int week = 1; week <= M / 7; week++) {
      Map<String, Long> nameLiveTime = new HashMap<>();
      Map<String, Integer> nameLiveCountDay = new HashMap<>();
      // !1주일 단위로 방송 횟수 방송시간 탐색
      for (int day = (week * 7) - 6; day <= (week * 7); day++) {
        for (UTUBER u : cal[day].list) {
          // System.out.println("day : " + day + " | name : " + u.name + " | time : " +
          // u.liveTime);
          // !제외된 사람이 아닌경우 횟수, 방송시간 증가
          if (!notVTUBER.contains(u.name)) {
            if (nameLiveTime.containsKey(u.name)) {
              nameLiveTime.put(u.name, (nameLiveTime.get(u.name) + u.liveTime));
            } else {
              nameLiveTime.put(u.name, u.liveTime);
            }
            if (nameLiveCountDay.containsKey(u.name)) {
              nameLiveCountDay.put(u.name, (nameLiveCountDay.get(u.name) + 1));
            } else {
              nameLiveCountDay.put(u.name, 1);
            }
          }
        }
      }
      // !매주 5회, 매주 총 60시간(3600분) 이상 라이브 방송 안한 사람 제외
      for (Map.Entry<String, Long> entry : nameLiveTime.entrySet()) {
        String key = entry.getKey();
        Long value = entry.getValue();
        // System.out.println("name : " + key + " | totalTime : " + value);
        // !조건이 맞으면 주간 방송횟수 +1
        if (value >= 3600 && nameLiveCountDay.get(key) >= 5) {
          if (nameLiveCountWeek.containsKey(key)) {
            nameLiveCountWeek.put(key, (nameLiveCountWeek.get(key) + 1));
          } else {
            nameLiveCountWeek.put(key, 1);
          }
        } else {
          if (nameLiveCountWeek.containsKey(key)) {
            nameLiveCountWeek.remove(key);
          }
          notVTUBER.add(key);
        }
      }
    }
    // !출력
    // System.out.println("notVTUBER : " + notVTUBER.toString());
    List<String> realVTUBER = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : nameLiveCountWeek.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();
      if (value == M / 7) {
        realVTUBER.add(key);
      }
    }
    if (realVTUBER.isEmpty()) {
      System.out.println(-1);
    } else {
      Collections.sort(realVTUBER);
      StringBuilder sb = new StringBuilder();
      for (String name : realVTUBER) {
        sb.append(name).append('\n');
      }
      System.out.print(sb.toString());
    }
  }
}
