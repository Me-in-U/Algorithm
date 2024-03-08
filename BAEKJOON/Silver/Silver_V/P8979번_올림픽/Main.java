package BAEKJOON.Silver.Silver_V.P8979번_올림픽;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static class Country implements Comparable<Country> {
        int countryNumber;
        int goldMedal;
        int silverMedal;
        int bronzeMedal;

        Country(int countryNumber, int goldMedal, int silverMedal, int bronzeMedal) {
            this.countryNumber = countryNumber;
            this.goldMedal = goldMedal;
            this.silverMedal = silverMedal;
            this.bronzeMedal = bronzeMedal;
        }

        @Override
        public int compareTo(Country c) {
            // 금메달 -> 은메달 -> 동메달
            if (this.goldMedal == c.goldMedal) {
                if (this.silverMedal == c.silverMedal)
                    return c.bronzeMedal - this.bronzeMedal;
                return c.silverMedal - this.silverMedal;
            }
            return c.goldMedal - this.goldMedal;
        }

        public boolean isSame(Country c) {
            if (this.goldMedal == c.goldMedal)
                if (this.silverMedal == c.silverMedal)
                    if (this.bronzeMedal == c.bronzeMedal)
                        return true;
            return false;
        }
    }

    protected static List<Country> countries;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        countries = new ArrayList<>(N + 1);
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            countries.add(new Country(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        countries.add(new Country(-1, 1000000, 0, 0));
        Collections.sort(countries);
        int rank = 1;
        Country c1 = countries.get(0);
        Country c2;
        for (int i = 1; i <= N; i++) {
            c2 = countries.get(i);
            if (!c1.isSame(c2))
                rank = i;
            if (c2.countryNumber == K)
                break;
            c1 = c2;
        }
        System.out.println(rank);
    }
}