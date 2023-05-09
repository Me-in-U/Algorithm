package P16199번_나이_계산하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] birth = br.readLine().split(" ");
    String[] date = br.readLine().split(" ");
    int man = 0;
    if (Integer.parseInt(date[1]) < Integer.parseInt(birth[1])) {
      man = Integer.parseInt(date[0]) - Integer.parseInt(birth[0]) - 1;
    } else if (Integer.parseInt(birth[1]) == Integer.parseInt(date[1])
        && Integer.parseInt(date[2]) < Integer.parseInt(birth[2])) {
      man = Integer.parseInt(date[0]) - Integer.parseInt(birth[0]) - 1;
    } else {
      man = Integer.parseInt(date[0]) - Integer.parseInt(birth[0]);
    }
    System.out.println(man);
    System.out.println(Integer.parseInt(date[0]) - Integer.parseInt(birth[0]) + 1);
    System.out.println(Integer.parseInt(date[0]) - Integer.parseInt(birth[0]));
  }
}