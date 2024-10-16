package P2712번_미국_스타일;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] data = br.readLine().split(" ");
            double amount = Double.parseDouble(data[0]);
            String unit = data[1];
            if (unit.equals("kg"))
                sb.append(String.format("%.04f lb", amount * 2.2046));
            else if (unit.equals("g"))
                sb.append(String.format("%.04f l", amount * 3.7854));
            else if (unit.equals("l"))
                sb.append(String.format("%.04f g", amount * 0.2642));
            else if (unit.equals("lb"))
                sb.append(String.format("%.04f kg", amount * 0.4536));
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}
