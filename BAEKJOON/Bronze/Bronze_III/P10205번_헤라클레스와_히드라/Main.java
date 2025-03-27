package P10205번_헤라클레스와_히드라;

import java.util.Scanner;

interface Main {
    static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        for (int k = 1, K = s.nextInt(), h; k <= K; k++) {
            h = s.nextInt();
            for (char c : s.next().toCharArray())
                h += c == 'c' ? 1 : -1;
            System.out.printf("Data Set %d:\n%d\n\n", k, h);
        }
    }
}