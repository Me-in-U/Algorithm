package P2596번_비밀편지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    HashMap<String,Character> map = new HashMap<>();
    map.put("000000", 'A');
    map.put("100000", 'A');
    map.put("010000", 'A');
    map.put("001000", 'A');
    map.put("000100", 'A');
    map.put("000010", 'A');
    map.put("000001", 'A');

    map.put("001111", 'B');
    map.put("101111", 'B');
    map.put("011111", 'B');
    map.put("000111", 'B');
    map.put("001011", 'B');
    map.put("001101", 'B');
    map.put("001110", 'B');

    map.put("010011", 'C');
    map.put("110011", 'C');
    map.put("000011", 'C');
    map.put("011011", 'C');
    map.put("010111", 'C');
    map.put("010001", 'C');
    map.put("010010", 'C');

    map.put("011100", 'D');
    map.put("111100", 'D');
    map.put("001100", 'D');
    map.put("010100", 'D');
    map.put("011000", 'D');
    map.put("011110", 'D');
    map.put("011101", 'D');

    map.put("100110", 'E');
    map.put("000110", 'E');
    map.put("110110", 'E');
    map.put("101110", 'E');
    map.put("100010", 'E');
    map.put("100100", 'E');
    map.put("100111", 'E');

    map.put("101001", 'F');
    map.put("001001", 'F');
    map.put("111001", 'F');
    map.put("100001", 'F');
    map.put("101101", 'F');
    map.put("101011", 'F');
    map.put("101000", 'F');

    map.put("110101", 'G');
    map.put("010101", 'G');
    map.put("100101", 'G');
    map.put("111101", 'G');
    map.put("110001", 'G');
    map.put("110111", 'G');
    map.put("110100", 'G');

    map.put("111010", 'H');
    map.put("011010", 'H');
    map.put("101010", 'H');
    map.put("110010", 'H');
    map.put("111110", 'H');
    map.put("111000", 'H');
    map.put("111011", 'H');

    int N = Integer.parseInt(br.readLine());
    String input = br.readLine();

    int start = 0;
    int end = 6;

    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < N; i++) {
      String temp = input.substring(start, end);
      if(map.containsKey(temp)){
        sb.append(map.get(temp));
        start += 6;
        end += 6;
      }
      else{
        sb = new StringBuilder();
        sb.append(i + 1);
        break;
      }
    }
    System.out.println(sb.toString());
  }
}
