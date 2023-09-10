package 브실컵.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] alphabet = new int[26];
    int N = Integer.parseInt(br.readLine());
    String line = br.readLine();
    for (int i = 0; i < N; i++) {
      alphabet[line.charAt(i) - 'A']++;
    }
    int count = Integer.MAX_VALUE;
    count = Math.min(count, alphabet['B' - 'A']);
    count = Math.min(count, alphabet['O' - 'A']);
    count = Math.min(count, alphabet['N' - 'A']);
    count = Math.min(count, alphabet['Z' - 'A']);

    count = Math.min(count, alphabet['S' - 'A']);
    count = Math.min(count, alphabet['I' - 'A']);
    count = Math.min(count, alphabet['L' - 'A']);
    count = Math.min(count, alphabet['V' - 'A']);

    count = Math.min(count, alphabet['R' - 'A'] / 2);
    count = Math.min(count, alphabet['E' - 'A'] / 2);
    System.out.println(count);
  }
}