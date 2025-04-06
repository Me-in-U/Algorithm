package BAEKJOON.Bronze.Bronze_V.P32154번_SUAPC_2024_Winter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        String output = "";
        if (input == 1) {
            output = "A B C D E F G H J L M ";
        } else if (input == 2) {
            output = "A C E F G H I L M ";
        } else if (input == 3) {
            output = "A C E F G H I L M ";
        } else if (input == 4) {
            output = "A B C E F G H L M ";
        } else if (input == 5) {
            output = "A C E F G H L M ";
        } else if (input == 6) {
            output = "A C E F G H L M ";
        } else if (input == 7) {
            output = "A C E F G H L M ";
        } else if (input == 8) {
            output = "A C E F G H L M ";
        } else if (input == 9) {
            output = "A C E F G H L M ";
        } else if (input == 10) {
            output = "A B C F G H L M ";
        }
        System.out.println(output.length() / 2);
        System.out.println(output.trim());
    }
}