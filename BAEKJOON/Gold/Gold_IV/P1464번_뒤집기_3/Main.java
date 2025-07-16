package BAEKJOON.Gold.Gold_IV.P1464번_뒤집기_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine().trim();

        Deque<Character> dq = new ArrayDeque<>();
        dq.addLast(S.charAt(0));

        for (int i = 1; i < S.length(); i++) {
            char c = S.charAt(i);
            if (dq.peekLast() < c) {
                dq.addFirst(c);
            } else {
                dq.addLast(c);
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!dq.isEmpty()) {
            ans.append(dq.removeLast());
        }

        System.out.println(ans);
    }
}
