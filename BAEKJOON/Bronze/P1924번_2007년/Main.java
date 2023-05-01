package P1924번_2007년;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    String dow[] = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    int month[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int day = 0;
    st = new StringTokenizer(br.readLine());
    int input_month = Integer.parseInt(st.nextToken());
    for(int i = 1; i < input_month; i++) {
      day += month[i];
    }
    day += (Integer.parseInt(st.nextToken()) - 1);
    day %= 7;
    System.out.println(dow[day]);
	}
}