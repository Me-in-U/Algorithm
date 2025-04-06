package BAEKJOON.Bronze.Bronze_IV.P33571번_구멍;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int c;
        int count = 0;
        while ((c = System.in.read()) != 10) {
            switch (c) {
            case 'A':
            case 'a':
            case 'b':
            case 'D':
            case 'd':
            case 'e':
            case 'g':
            case 'O':
            case 'o':
            case 'P':
            case 'p':
            case 'Q':
            case 'q':
            case 'R':
            case '@':
                count++;
                break;
            case 'B':
                count += 2;
                break;
            default:
                break;
            }
        }
        System.out.print(count);
    }
}
