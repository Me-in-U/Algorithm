package P9793번_Length_and_Frequency_of_Sentences;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new TreeMap<>();
        while (N-- > 0) {
            int count = br.readLine().trim().split("\\s+").length;
            map.put(count, map.getOrDefault(count, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey()).append(' ').append(entry.getValue()).append('\n');
        }
        System.out.print(sb.toString());
    }
}