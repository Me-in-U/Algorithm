package 건국대.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int maxBlackLine = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            String data = br.readLine();
            char color = data.charAt(0);
            int blackLine = 0;
            if (color == '1') {
                blackLine++;
            }
            for (int j = 1; j < L; j++) {
                if (color != data.charAt(j)) {
                    color = data.charAt(j);
                    if (color == '1') {
                        blackLine++;
                    }
                }
            }
            if (maxBlackLine == blackLine) {
                count++;
            } else if (maxBlackLine < blackLine) {
                count = 1;
                maxBlackLine = blackLine;
            }
        }
        System.out.println(maxBlackLine + " " + count);
    }
}