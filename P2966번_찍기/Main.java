package P2966번_찍기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int num = Integer.parseInt(br.readLine());
    String input = br.readLine();

    String Adrian = "ABC";
    String Bruno = "BABC";
    String Goran = "CCAABB";

    int a = 0;
    int b = 0;
    int c = 0;
    int max = 0;
    int index = 0;
    for (int i = 0; i < input.length(); i++) {
      if(Adrian.charAt(index) == input.charAt(i)){
        a++;
      }
      if(index == Adrian.length() - 1){
        index = 0;
      }
      else{
        index++;
      }
    }
    if(max < a){
      max = a;
    }
    index = 0;
    for (int i = 0; i < input.length(); i++) {
      if(Bruno.charAt(index) == input.charAt(i)){
        b++;
      }
      if(index == Bruno.length() - 1){
        index = 0;
      }
      else{
        index++;
      }
    }
    if(max < b){
      max = b;
    }
    index = 0;
    for (int i = 0; i < input.length(); i++) {
      if(Goran.charAt(index) == input.charAt(i)){
        c++;
      }
      if(index == Goran.length() - 1){
        index = 0;
      }
      else{
        index++;
      }
    }
    if(max < c){
      max = c;
    }

    //출력
    System.out.println(max);
    if(a == max){
      System.out.println("Adrian");
    }
    if(b == max){
      System.out.println("Bruno");
    }
    if(c == max){
      System.out.println("Goran");
    }
	}
}