package P2915번_로마_숫자_재배치;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String rome = br.readLine();
        if (rome.length() == 1) {
            System.out.println(rome);
        } else {
            int ten = 0;
            int one = 0;
            if (rome.contains("XC")) {
                ten = 9;
            } else {
                if (rome.contains("LXXX"))
                    ten = 8;
                else if (rome.contains("LXX"))
                    ten = 7;
                else if (rome.contains("LX"))
                    ten = 6;
                else if (rome.contains("XL"))
                    ten = 4;
                else if (rome.contains("L"))
                    ten = 5;
                else if (rome.contains("XXX"))
                    ten = 3;
                else if (rome.contains("XX"))
                    ten = 2;
            }
            if (rome.contains("IX")) {
                rome = rome.replace("IX", "");
                one = 9;
            }
            if (ten == 0 && rome.contains("X"))
                ten = 1;
            if (one == 0) {
                if (rome.contains("VIII"))
                    one = 8;
                else if (rome.contains("VII"))
                    one = 7;
                else if (rome.contains("VI"))
                    one = 6;
                else if (rome.contains("IV"))
                    one = 4;
                else if (rome.contains("V"))
                    one = 5;
                else if (rome.contains("III"))
                    one = 3;
                else if (rome.contains("II"))
                    one = 2;
                else if (rome.contains("I"))
                    one = 1;
            }
            int number = 0;
            if (ten != 0) {
                if (ten == 6)
                    ten = 4;
                number = ten * 10;
            }
            if (one != 0) {
                if (one == 6)
                    number += 4;
                else
                    number += one;
            }
            if (number == 11)
                number = 9;
            else if (number == 21)
                number = 19;
            else if (number == 31)
                number = 29;
            else if (number == 59)
                number = 41;
            else if (number == 71)
                number = 49;
            else if (number == 81)
                number = 79;
            ten = number / 10;
            one = number % 10;
            String[] tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
            String[] ones = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
            System.out.println(tens[ten] + ones[one]);
        }
    }
}