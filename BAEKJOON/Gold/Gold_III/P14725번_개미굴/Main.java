package BAEKJOON.Gold.Gold_III.P14725번_개미굴;

/**
 * <h1>BAEKJOON 14725번 개미굴</h1>
 * <p>
 * JAVA11 : 메모리 15972KB, 시간 128ms
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-04-29
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    private static class Node {
        TreeMap<String, Node> nodes = new TreeMap<>();

        public void insert(String[] word, int index) {
            if (index < word.length) {
                nodes.computeIfAbsent(word[index], k -> new Node()).insert(word, index + 1);
            }
        }

        public void print(int depth) {
            for (Map.Entry<String, Node> e : nodes.entrySet()) {
                sb.append("--".repeat(depth)).append(e.getKey()).append("\n");
                e.getValue().print(depth + 1);
            }
        }
    }

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Node root = new Node();
        while (N-- > 0) {
            String[] parts = br.readLine().split(" ");
            root.insert(parts, 1);
        }
        root.print(0);
        System.out.print(sb.toString());
    }
}
