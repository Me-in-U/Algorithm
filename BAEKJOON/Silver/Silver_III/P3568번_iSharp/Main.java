package P3568번_iSharp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        line = line.substring(0, line.length() - 1).replace(",", "");
        String[] subs = line.split(" ");
        for (int i = 1; i < subs.length; i++) {
            sb.append(subs[0]);
            StringBuilder name = new StringBuilder();
            StringBuilder arp = new StringBuilder();
            for (int j = 0; j < subs[i].length(); j++) {
                char c = subs[i].charAt(j);
                if ('a' <= c && c <= 'z' ||
                        'A' <= c && c <= 'Z') {
                    name.append(c);
                } else {
                    if (c == '[') {
                        c = ']';
                    } else if (c == ']') {
                        c = '[';
                    }
                    arp.append(c);
                }
            }
            sb.append(arp.reverse()).append(' ').append(name).append(';').append('\n');
        }
        System.out.print(sb.toString());
    }
}