package P16395번_파스칼의_삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int result = 1;
        if (!(K == 1 || N == K || N <= 2)) {
            List<Integer> list = new LinkedList<>();
            list.add(1);
            list.add(1);
            for (int i = 3; i <= N; i++) {
                List<Integer> temp = new LinkedList<>();
                temp.add(1);
                for (int j = 0; j < list.size() - 1; j++) {
                    temp.add(list.get(j) + list.get(j + 1));
                }
                temp.add(1);
                list = temp;
            }
            result = list.get(K - 1);
        }
        System.out.println(result);
    }
}