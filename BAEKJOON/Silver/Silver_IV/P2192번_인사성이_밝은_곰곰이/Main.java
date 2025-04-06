package BAEKJOON.Silver.Silver_IV.P2192번_인사성이_밝은_곰곰이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        while (N-- > 0) {
            String line = br.readLine();
            if (line.equals("ENTER")) {
                set.clear();
            } else {
                if (!set.contains(line)) {
                    set.add(line);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}