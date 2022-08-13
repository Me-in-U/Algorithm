package P1157번_단어_공부;

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    sc.close();
    int count[] =  new int[26];
    for(int i = 0; i<26; i++)
        count[i] = 0;
    for(int i= 0;i<input.length();i++){
        for(int k =65;k<91;k++){
            if((input.charAt(i) == k)||(input.charAt(i)==(k+32))){
            count[k-65]++;
            }
        }
    }
    int max_count = 0;
    char output =' ';
    for(int i = 0; i<26; i++){
        if(count[i]>max_count){
            max_count=count[i];
            output = (char)(i+ 65);
        }
        else if(count[i] == max_count){
            max_count=count[i];
            output = '?';
        }
    }
    System.out.println(output);
  }
}