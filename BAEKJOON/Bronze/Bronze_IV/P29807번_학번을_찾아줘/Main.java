package P29807번_학번을_찾아줘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int language = st.hasMoreTokens() ? Integer.parseInt(st.nextToken()) : 0;
    int math = st.hasMoreTokens() ? Integer.parseInt(st.nextToken()) : 0;
    int english = st.hasMoreTokens() ? Integer.parseInt(st.nextToken()) : 0;
    int search = st.hasMoreTokens() ? Integer.parseInt(st.nextToken()) : 0;
    int secondLanguage = st.hasMoreTokens() ? Integer.parseInt(st.nextToken()) : 0;
    int result = 0;
    if (language > english) {
      result += (language - english) * 508;
    } else {
      result += (english - language) * 108;
    }
    if (math > search) {
      result += (math - search) * 212;
    } else {
      result += (search - math) * 305;
    }
    if (secondLanguage != 0) {
      result += (secondLanguage * 707);
    }
    result *= 4763;
    System.out.println(result);
  }
}