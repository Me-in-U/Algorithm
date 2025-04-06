package BAEKJOON.Silver.Silver_V.P10527번_Judging_Troubles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String key = br.readLine();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            String key = br.readLine();
            if (map.containsKey(key) && map.get(key) > 0) {
                map.put(key, map.get(key) - 1);
                count++;
            }
        }
        System.out.println(count);
    }
}