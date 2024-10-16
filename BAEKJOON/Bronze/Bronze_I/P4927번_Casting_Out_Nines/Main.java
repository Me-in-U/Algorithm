package P4927번_Casting_Out_Nines;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        int caseNumber = 1;
        while (!(line = br.readLine().trim()).equals(".")) {
            int plus = line.indexOf('+');
            int multi = line.indexOf('*');
            int equals = line.indexOf('=');
            String a = line.substring(0, plus != -1 ? plus : multi);
            String b = line.substring(plus != -1 ? plus : multi + 1, equals);
            String c = line.substring(equals + 1, line.length() - 1);
            int aBar = sumOfDigits(a);
            int bBar = sumOfDigits(b);
            int cBar = sumOfDigits(c);
            int resultCheck;
            if (plus != -1) {
                resultCheck = (aBar + bBar) % 9;
            } else {
                resultCheck = (aBar * bBar) % 9;
            }
            if (resultCheck == cBar) {
                sb.append(caseNumber++).append(". PASS\n");
            } else {
                sb.append(caseNumber++).append(". NOT!\n");
            }
        }
        System.out.print(sb.toString());
    }

    private static int sumOfDigits(String num) {
        int sum = 0;
        for (char ch : num.toCharArray()) {
            sum += ch - '0';
        }
        return sum % 9;
    }
}
