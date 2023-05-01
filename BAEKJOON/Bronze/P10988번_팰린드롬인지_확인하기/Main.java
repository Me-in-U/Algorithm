package P10988번_팰린드롬인지_확인하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
    boolean palindrome = true;
    for(int i = 0; i < input.length() / 2; i++) {
      if(input.charAt(i) != input.charAt(input.length() - 1 - i)){
        palindrome = false;
        break;
      }
    }

    if(palindrome)
      System.out.println("1");    
    else
      System.out.println("0");    
	}
}