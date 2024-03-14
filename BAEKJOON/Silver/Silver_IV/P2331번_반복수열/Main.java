package BAEKJOON.Silver.Silver_IV.P2331번_반복수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        double P = Integer.parseInt(st.nextToken());
        int[] power = new int[10];
        for (int i = 0; i < 10; i++) {
            power[i] = (int) Math.pow(i, P);
        }
        Set<Integer> set = new HashSet<>();
        set.add(Integer.parseInt(A));
        while (true) {
            int nextNumber = 0;
            for (int i = 0; i < A.length(); i++) {
                nextNumber += power[A.charAt(i) - '0'];
            }
            A = String.valueOf(nextNumber);
            if (set.contains(nextNumber)) {

            } else {

            }
        }
    }
}