package BAEKJOON.Silver.Silver_V.P31216번_슈퍼_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] numbers = new int[T];
        for (int i = 0; i < T; i++)
            numbers[i] = Integer.parseInt(br.readLine());
        Arrays.sort(numbers);
        int maxNumber = 318137;
        boolean[] isPrime = new boolean[maxNumber + 1];
        for (int i = 2; i <= maxNumber; i++)
            isPrime[i] = true;
        for (int i = 2; i * i <= maxNumber; i++)
            if (isPrime[i])
                for (int j = i * i; j <= maxNumber; j += i)
                    isPrime[j] = false;
        List<Integer> superPrime = new ArrayList<>();
        int countPrime = 0;
        for (int i = 2; i <= maxNumber; i++)
            if (isPrime[i])
                if (isPrime[++countPrime])
                    superPrime.add(i);
        StringBuilder sb = new StringBuilder();
        for (int index : numbers)
            sb.append(superPrime.get(index - 1)).append('\n');
        System.out.print(sb.toString());
    }
}
