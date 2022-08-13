package P8958번_OX퀴즈;

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tries = sc.nextInt();
    int result[] = new int[tries]; 
    for(int i = 0; i< tries;i++){
        String input = sc.next();
        int add = 1;
        for(int j = 0; j < input.length();j++){
            if(input.charAt(j)=='O'){
                result[i]+=add;
                add++;
            }
            else{
                add = 1;
            }
        }
    }
    sc.close();
    for(int k = 0; k<tries;k++){
        System.out.println(result[k]);    
    }
  }
}