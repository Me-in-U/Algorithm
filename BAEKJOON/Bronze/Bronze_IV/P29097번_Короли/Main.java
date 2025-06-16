package BAEKJOON.Bronze.Bronze_IV.P29097번_Короли;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int m = readInt();
        int k = readInt();
        int a = readInt();
        int b = readInt();
        int c = readInt();

        int joffrey = n * a;
        int robb = m * b;
        int stannis = k * c;

        int max = Math.max(joffrey, Math.max(robb, stannis));

        List<String> kings = new ArrayList<>();
        if (joffrey == max)
            kings.add("Joffrey");
        if (robb == max)
            kings.add("Robb");
        if (stannis == max)
            kings.add("Stannis");

        Collections.sort(kings);

        StringBuilder sb = new StringBuilder();
        for (String name : kings) {
            sb.append(name).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        while (c <= ' ')
            c = System.in.read();
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
