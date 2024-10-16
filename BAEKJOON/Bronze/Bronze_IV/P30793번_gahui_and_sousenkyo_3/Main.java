package P30793번_gahui_and_sousenkyo_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        String[] output = { "weak", "normal", "strong", "very strong" };
        System.out.println(output[getResult(a / b)]);
    }

    public static int getResult(double div) {
        if (div < 0.2)
            return 0;
        else if (0.2 <= div && div < 0.4)
            return 1;
        else if (0.4 <= div && div < 0.6)
            return 2;
        return 3;
    }
}
