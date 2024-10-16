package P16316번_Baby_Bites;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        boolean countWell = true;
        for (int i = 0; i < n; i++) {
            if (!input[i].equals("mumble")) {
                if (Integer.parseInt(input[i]) != i + 1) {
                    countWell = false;
                    break;
                }
            }
        }
        System.out.println(countWell ? "makes sense" : "something is fishy");
    }
}