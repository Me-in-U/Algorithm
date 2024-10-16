package P31609번_Appearing_Numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] numbers = new boolean[10];
        while (N-- > 0)
            numbers[Integer.parseInt(st.nextToken())] = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++)
            if (numbers[i])
                sb.append(i).append('\n');
        System.out.print(sb.toString());
    }
}