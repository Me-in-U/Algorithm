package P1251번_단어_나누기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
  public static class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
      return o1.compareTo(o2);
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    String[] comStrings = new String[2];
    comStrings[0] = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
    for (int start = 1; start < input.length() - 1; start++) {
      for (int end = start + 1; end < input.length(); end++) {
        String front = input.substring(0, start);
        String middle = input.substring(start, end);
        String back = input.substring(end, input.length());
        comStrings[1] = flip(front) + flip(middle) + flip(back);
        // System.out.println(front + " " + middle + " " + back + " - " +
        // comStrings[0]);
        Arrays.sort(comStrings, new StringCompare());
      }
    }
    System.out.println(comStrings[0]);
  }

  public static String flip(String input) {
    int length = input.length();
    if (length == 1) {
      return input;
    }
    StringBuilder flipped = new StringBuilder();
    for (int i = length - 1; i >= 0; i--) {
      flipped.append(input.charAt(i));
    }
    return flipped.toString();
  }
}