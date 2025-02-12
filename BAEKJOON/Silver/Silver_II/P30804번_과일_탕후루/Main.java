package P30804번_과일_탕후루;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int[] tanghulu = new int[N];
        for (int i = 0; i < N; i++) {
            tanghulu[i] = readInt();
        }
        int[] fruitsCount = new int[10];
        int fruitKinds = 0;
        int start = 0;
        int end = -1;
        int maxFruitCount = 0;
        while (end < N - 1) {
            if (fruitKinds <= 2) {
                if (fruitsCount[tanghulu[++end]] == 0) {
                    fruitKinds++;
                }
                fruitsCount[tanghulu[end]]++;
            } else {
                if (--fruitsCount[tanghulu[start]] == 0) {
                    fruitKinds--;
                }
                start++;
            }
            if (fruitKinds <= 2) {
                int count = end - start + 1;
                if (maxFruitCount < count) {
                    maxFruitCount = count;
                }
            }
        }
        System.out.println(maxFruitCount);
    }

    public static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}