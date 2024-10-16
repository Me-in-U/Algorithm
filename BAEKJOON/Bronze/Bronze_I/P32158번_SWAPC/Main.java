package P32158번_SWAPC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] words = br.readLine().toCharArray();
        Queue<Integer> queue_c = new LinkedList<>();
        Queue<Integer> queue_p = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            if (words[i] == 'C')
                queue_c.add(i);
            if (words[i] == 'P') {
                queue_p.add(i);
            }
        }
        while (!queue_c.isEmpty() && !queue_p.isEmpty()) {
            words[queue_c.poll()] = 'P';
            words[queue_p.poll()] = 'C';
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(words[i]);
        }
        System.out.println(sb.toString());
    }
}