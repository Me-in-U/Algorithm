package P5637번_가장_긴_단어;

import java.util.*;

interface Main {
    static void main(String[] g) {
        Scanner s = new Scanner(System.in);
        String m = "", l;
        while (!(l = s.nextLine()).contains("E-N-D"))
            for (String w : l.replaceAll("[^a-zA-Z-]", " ").split("\\s+"))
                if (w.length() > m.length())
                    m = w;
        System.out.print(m.toLowerCase());
        s.close();
    }
}