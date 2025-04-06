package BAEKJOON.Silver.Silver_IV.P3986번_좋은_단어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String str = br.readLine();
            if (str.length() % 2 == 1) {
                continue;
            }
            Deque<Character> dq = new LinkedList<>();
            for (int i = 0; i < str.length(); i++) {
                if (!dq.isEmpty()) {
                    if (dq.peekLast() == str.charAt(i)) {
                        dq.pollLast();
                        continue;
                    }
                }
                dq.addLast(str.charAt(i));
            }
            if (dq.isEmpty()) {
                result++;
            }
        }
        System.out.println(result);
    }
}