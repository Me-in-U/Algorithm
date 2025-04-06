package BAEKJOON.Bronze.Bronze_V.P30676번_이_별은_무슨_색일까;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lambda = Integer.parseInt(br.readLine());
        if (380 <= lambda && lambda < 425) {
            System.out.println("Violet");
        } else if (425 <= lambda && lambda < 450) {
            System.out.println("Indigo");
        } else if (450 <= lambda && lambda < 495) {
            System.out.println("Blue");
        } else if (495 <= lambda && lambda < 570) {
            System.out.println("Green");
        } else if (570 <= lambda && lambda < 590) {
            System.out.println("Yellow");
        } else if (590 <= lambda && lambda < 620) {
            System.out.println("Orange");
        } else if (620 <= lambda && lambda <= 780) {
            System.out.println("Red");
        }
    }
}