package P31429번_SUAPC_2023_Summer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        String output = "";
        if (input == 1) {
            output = "12 1600";
        } else if (input == 2) {
            output = "11 894";
        } else if (input == 3) {
            output = "11 1327";
        } else if (input == 4) {
            output = "10 1311";
        } else if (input == 5) {
            output = "9 1004";
        } else if (input == 6) {
            output = "9 1178";
        } else if (input == 7) {
            output = "9 1357";
        } else if (input == 8) {
            output = "8 837";
        } else if (input == 9) {
            output = "7 1055";
        } else if (input == 10) {
            output = "6 556";
        } else if (input == 11) {
            output = "6 773";
        }
        System.out.println(output);
    }
}