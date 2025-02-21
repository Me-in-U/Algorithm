package SWEA.하.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        char winner;
        if (A == 1) {
            winner = B == 2 ? 'B' : 'A';
        } else if (A == 2) {
            winner = B == 1 ? 'A' : 'B';
        } else {
            winner = B == 1 ? 'B' : 'A';
        }
        System.out.println(winner);
    }
}