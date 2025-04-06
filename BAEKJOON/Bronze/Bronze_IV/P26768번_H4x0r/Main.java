package BAEKJOON.Bronze.Bronze_IV.P26768번_H4x0r;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] data = { '4', 'b', 'c', 'd', '3', 'f', 'g', 'h', '1', 'j', 'k', 'l', 'm', 'n', '0',
        'p', 'q', 'r', '5', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };
    String result = br.readLine().chars()
        .mapToObj(c -> String.valueOf(data[c - 'a']))
        .collect(Collectors.joining());
    System.out.print(result);
  }
}