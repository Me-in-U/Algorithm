package BAEKJOON.Gold.Gold_III.P14725번_개미굴;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    protected static class Node {
        HashMap<String, Node> nodes;

        public Node() {
            this.nodes = new HashMap<>();
        }

        public void insert(String[] input, int index) {
            if (index < input.length) {
                if (!this.nodes.containsKey(input[index])) {
                    this.nodes.put(input[index], new Node());
                }
                this.nodes.get(input[index]).insert(input, index + 1);
            }
        }

        public void print(StringBuilder dash) {
            ArrayList<String> words = new ArrayList<>(this.nodes.keySet());
            Collections.sort(words);
            for (String word : words) {
                sb.append(dash).append(word).append("\n");
                dash.append("--");
                this.nodes.get(word).print(new StringBuilder(dash));
                dash.delete(0, 2);
            }
        }
    }

    protected static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Node root = new Node();
        while (N-- > 0) {
            String[] input = br.readLine().split(" ");
            root.insert(input, 1);
        }
        root.print(new StringBuilder());
        System.out.println(sb.toString().trim());
    }
}