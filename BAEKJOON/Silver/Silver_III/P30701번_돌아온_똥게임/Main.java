package BAEKJOON.Silver.Silver_III.P30701번_돌아온_똥게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int clearCount = 0;
        BigInteger D = new BigInteger(st.nextToken());
        PriorityQueue<Integer> equipments = new PriorityQueue<>();
        PriorityQueue<Integer> monsters = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());
            if (A == 1) {
                monsters.add(X);
            } else {
                equipments.add(X);
            }
        }
        while (!monsters.isEmpty()) {
            int monster = monsters.peek();
            if (D.compareTo(BigInteger.valueOf(monster)) > 0) {
                D = D.add(BigInteger.valueOf(monster));
                monsters.poll();
                clearCount++;
            } else {
                if (!equipments.isEmpty()) {
                    D = D.multiply(BigInteger.valueOf(equipments.poll()));
                    clearCount++;
                } else {
                    break;
                }
            }
        }
        if (!equipments.isEmpty()) {
            clearCount += equipments.size();
        }
        System.out.println(clearCount);
    }
}