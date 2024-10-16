package P28278번_스택_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            switch (Integer.parseInt(input[0])) {
                case 1:
                    dq.addFirst(Integer.parseInt(input[1]));
                    continue;
                case 2:
                    sb.append(dq.isEmpty() ? -1 : dq.pollFirst());
                    break;
                case 3:
                    sb.append(dq.size());
                    break;
                case 4:
                    sb.append(dq.isEmpty() ? 1 : 0);
                    break;
                case 5:
                    sb.append(dq.isEmpty() ? -1 : dq.peekFirst());
                    break;
                default:
                    break;
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}