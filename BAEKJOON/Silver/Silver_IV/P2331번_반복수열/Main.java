package P2331번_반복수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
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
        Set<Integer> set1 = new HashSet<>();
        set1.add(Integer.parseInt(A));
        while (true) {
            int nextNumber = 0;
            for (int i = 0; i < A.length(); i++) {
                nextNumber += power[A.charAt(i) - '0'];
            }
            A = String.valueOf(nextNumber);
            if (set1.contains(nextNumber)) {
                break;
            } else {
                set1.add(nextNumber);
            }
        }
        Set<Integer> set2 = new HashSet<>();
        set2.add(Integer.parseInt(A));
        while (true) {
            int nextNumber = 0;
            for (int i = 0; i < A.length(); i++) {
                nextNumber += power[A.charAt(i) - '0'];
            }
            A = String.valueOf(nextNumber);
            if (set1.contains(nextNumber) && set2.contains(nextNumber)) {
                break;
            } else {
                set2.add(nextNumber);
            }
        }
        System.out.println(set1.size() - set2.size());
    }
}