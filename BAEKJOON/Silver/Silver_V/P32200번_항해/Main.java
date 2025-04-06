package BAEKJOON.Silver.Silver_V.P32200번_항해;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int N = readInt();
        int X = readInt();
        int Y = readInt();
        int meals = 0;
        int waste = 0;
        int gap = Y - X;
        while (N-- > 0) {
            int length = readInt();
            if (length < X)
                waste += length;
            else {
                // 최소한 먹었을때
                int tempMeals = length / X;
                int tempWaste = length % X;
                meals += tempMeals;
                // X와 Y의 여유가 있는거만큼 빼줌
                if (tempWaste > (gap * tempMeals)) {
                    waste += tempWaste - (gap * tempMeals);
                }
            }
        }
        sb.append(meals).append('\n').append(waste);
        System.out.print(sb);
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