package BAEKJOON.Bronze.Bronze_I.P14696번_딱지놀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final int STAR = 4;
    static final int CIRCLE = 3;
    static final int SQUARE = 2;
    static final int TRIANGLE = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            int[] A = countShapes(br.readLine());
            int[] B = countShapes(br.readLine());
            sb.append(determineWinner(A, B)).append('\n');
        }
        System.out.print(sb.toString());
    }

    private static int[] countShapes(String input) {
        StringTokenizer st = new StringTokenizer(input);
        int[] shapes = new int[5];
        int count = Integer.parseInt(st.nextToken());
        for (int j = 0; j < count; j++) {
            shapes[Integer.parseInt(st.nextToken())]++;
        }
        return shapes;
    }

    private static String determineWinner(int[] A, int[] B) {
        for (int shape = STAR; shape >= TRIANGLE; shape--) {
            if (A[shape] > B[shape])
                return "A";
            if (A[shape] < B[shape])
                return "B";
        }
        return "D";
    }
}
