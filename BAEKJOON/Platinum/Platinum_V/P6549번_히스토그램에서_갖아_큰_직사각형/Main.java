package P6549번_히스토그램에서_갖아_큰_직사각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            if (N == 0) {
                break;
            }
            int[] histogram = new int[N + 2];
            for (int i = 1; i <= N; i++) {
                histogram[i] = Integer.parseInt(st.nextToken());
            }
            Deque<Integer> stack = new ArrayDeque<>();
            long maxArea = 0;
            for (int i = 0; i < histogram.length; i++) {
                while (!stack.isEmpty() && histogram[stack.peek()] > histogram[i]) {
                    int height = histogram[stack.pop()];
                    long width = (i - 1) - (stack.isEmpty() ? 0 : stack.peek());
                    maxArea = Math.max(maxArea, height * width);
                }
                stack.push(i);
            }
            sb.append(maxArea).append('\n');
        }
        System.out.print(sb.toString());
    }
}