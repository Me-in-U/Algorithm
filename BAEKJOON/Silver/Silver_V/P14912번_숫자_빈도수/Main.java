package BAEKJOON.Silver.Silver_V.P14912번_숫자_빈도수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nd = br.readLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        char d = nd[1].charAt(0);
        int count = 0;
        while (n > 0) {
            String number = String.valueOf(n);
            for (char j = 0; j < number.length(); j++)
                if (number.charAt(j) == d)
                    count++;
            n--;
        }
        System.out.print(count);
    }
}