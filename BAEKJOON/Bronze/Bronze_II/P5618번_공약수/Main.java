package P5618번_공약수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int gcd = 0;
        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        gcd = n == 2 ? gcd(a, b) : gcd(gcd(a, b), Integer.parseInt(st.nextToken()));
        for (int i = 1; i <= Math.sqrt(gcd); i++) {
            if (gcd % i == 0) {
                list.add(i);
                if (i * i != gcd) {
                    list.add(gcd / i);
                }
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (int num : list) {
            sb.append(num).append('\n');
        }
        System.out.print(sb.toString());
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
