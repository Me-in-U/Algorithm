package P1907번_탄소_화합물;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static class Molecules {
        int C = 0;
        int H = 0;
        int O = 0;

        public Molecules(String data) {
            char before = data.charAt(0);
            int upCount = 0;
            for (int i = 1; i < data.length(); i++) {
                char next = data.charAt(i);
                if ('2' <= next && next <= '9') {
                    upCount = next - '0';
                    if (before == 'C') {
                        C += upCount;
                    } else if (before == 'H') {
                        H += upCount;
                    } else if (before == 'O') {
                        O += upCount;
                    }
                } else {
                    if (before == 'C') {
                        C++;
                    } else if (before == 'H') {
                        H++;
                    } else if (before == 'O') {
                        O++;
                    }
                }
                before = next;
            }
            if (data.charAt(data.length() - 1) > '9') {
                if (before == 'C') {
                    C++;
                } else if (before == 'H') {
                    H++;
                } else if (before == 'O') {
                    O++;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("[+=]");
        Molecules X1 = new Molecules(input[0]);
        Molecules X2 = new Molecules(input[1]);
        Molecules X3 = new Molecules(input[2]);

        for (int x1 = 1; x1 <= 10; x1++) {
            for (int x2 = 1; x2 <= 10; x2++) {
                for (int x3 = 1; x3 <= 10; x3++) {
                    int leftC = X1.C * x1 + X2.C * x2;
                    int rightC = X3.C * x3;
                    if (leftC < rightC) {
                        break;
                    }
                    int leftH = X1.H * x1 + X2.H * x2;
                    int rightH = X3.H * x3;
                    if (leftH < rightH) {
                        break;
                    }
                    int leftO = X1.O * x1 + X2.O * x2;
                    int rightO = X3.O * x3;
                    if (leftO < rightO) {
                        break;
                    }
                    if (leftC == rightC && leftH == rightH && leftO == rightO) {
                        System.out.print(new StringBuilder().append(x1).append(' ').append(x2).append(' ').append(x3)
                                .toString());
                        return;
                    }
                }
            }
        }
    }
}
