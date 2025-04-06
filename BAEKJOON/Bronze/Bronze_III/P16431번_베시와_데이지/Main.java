package BAEKJOON.Bronze.Bronze_III.P16431번_베시와_데이지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int Br = Integer.parseInt(input[0]);
        int Bc = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int Dr = Integer.parseInt(input[0]);
        int Dc = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int Jr = Integer.parseInt(input[0]);
        int Jc = Integer.parseInt(input[1]);
        int bTime = Math.max(Math.abs(Jr - Br), Math.abs(Jc - Bc));
        int dTime = Math.abs(Jr - Dr) + Math.abs(Jc - Dc);
        if (bTime == dTime)
            System.out.println("tie");
        else
            System.out.println((bTime < dTime) ? "bessie" : "daisy");
    }
}