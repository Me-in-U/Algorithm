package HPEC.B번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
  public static class ScoreDiffs {
    int koreanEnglish;
    int mathResearch;

    ScoreDiffs(int koreanEnglish, int mathResearch) {
      this.koreanEnglish = koreanEnglish;
      this.mathResearch = mathResearch;
    }

    public static final Comparator<ScoreDiffs> scoreComparator = (s1, s2) -> {
      int koreanEnglishCompare = Integer.compare(s1.koreanEnglish, s2.koreanEnglish);
      return koreanEnglishCompare == 0 ? Integer.compare(s1.mathResearch, s2.mathResearch) : koreanEnglishCompare;
    };
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int result = Integer.parseInt(br.readLine()) / 4763;
    int koreanEnglish = 0;
    int mathResearch = 0;
    // Set<ScoreDiffs> set = new HashSet<>();
    List<ScoreDiffs> scores = new LinkedList<>();
    for (int i = 1; i <= 200; i++) {
      koreanEnglish = i * 508;
      for (int j = 1; j <= 200; j++) {
        mathResearch = j * 212;
        if (koreanEnglish + mathResearch == result) {
          scores.add(new ScoreDiffs(i, j));
        }
      }
      for (int j = 0; j <= 200; j++) {
        mathResearch = j * 305;
        if (koreanEnglish + mathResearch == result) {
          scores.add(new ScoreDiffs(i, j));
        }
      }
    }
    for (int i = 0; i <= 200; i++) {
      koreanEnglish = i * 108;
      for (int j = 1; j <= 200; j++) {
        mathResearch = j * 212;
        if (koreanEnglish + mathResearch == result) {
          scores.add(new ScoreDiffs(i, j));
        }
      }
      for (int j = 0; j <= 200; j++) {
        mathResearch = j * 305;
        if (koreanEnglish + mathResearch == result) {
          scores.add(new ScoreDiffs(i, j));
        }
      }
    }
    Collections.sort(scores, ScoreDiffs.scoreComparator);
    // !출력
    StringBuilder sb = new StringBuilder();
    sb.append(scores.size()).append('\n');
    while (!scores.isEmpty()) {
      ScoreDiffs scoreData = scores.remove(0);
      sb.append(scoreData.koreanEnglish).append(' ').append(scoreData.mathResearch).append('\n');
    }
    System.out.print(sb.toString());
  }
}