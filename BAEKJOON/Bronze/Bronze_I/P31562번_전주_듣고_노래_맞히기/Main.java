package BAEKJOON.Bronze.Bronze_I.P31562번_전주_듣고_노래_맞히기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static class Node {
        Node[] nodes;
        LinkedList<String> songs;

        Node() {
            this.nodes = new Node[7];
        }

        public void add(char c1, char c2, char c3, String s) {
            this.nodes[c1 - 'A'].nodes[c2 - 'A'].nodes[c3 - 'A'].songs.add(s);
        }

        public String find(char c1, char c2, char c3) {
            int size = this.nodes[c1 - 'A'].nodes[c2 - 'A'].nodes[c3 - 'A'].songs.size();
            if (size == 0)
                return "!";
            else if (size == 1) {
                return this.nodes[c1 - 'A'].nodes[c2 - 'A'].nodes[c3 - 'A'].songs.get(0);
            } else {
                return "?";
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Node root = new Node();
        for (int i = 0; i < 7; i++) {
            root.nodes[i] = new Node();
            root.nodes[i].nodes = new Node[7];
            for (int j = 0; j < 7; j++) {
                root.nodes[i].nodes[j] = new Node();
                root.nodes[i].nodes[j].nodes = new Node[7];
                for (int k = 0; k < 7; k++) {
                    root.nodes[i].nodes[j].nodes[k] = new Node();
                    root.nodes[i].nodes[j].nodes[k].songs = new LinkedList<>();
                }
            }
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            char c1 = st.nextToken().charAt(0);
            char c2 = st.nextToken().charAt(0);
            char c3 = st.nextToken().charAt(0);
            root.add(c1, c2, c3, name);
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            char c1 = st.nextToken().charAt(0);
            char c2 = st.nextToken().charAt(0);
            char c3 = st.nextToken().charAt(0);
            sb.append(root.find(c1, c2, c3)).append('\n');
        }
        System.out.print(sb.toString());
    }
}