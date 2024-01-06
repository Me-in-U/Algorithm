package BAEKJOON.Bronze.Bronze_II.P1297번_TV_크기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] DWH = Arrays.stream(new BufferedReader(new InputStreamReader(System.in)).readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        double ra = Math.sqrt((DWH[0] * DWH[0]) / (DWH[1] * DWH[1] + DWH[2] * DWH[2] * 1.0));
        System.out.println((int) (ra * DWH[1]) + " " + (int) (ra * DWH[2]));
    }
}
