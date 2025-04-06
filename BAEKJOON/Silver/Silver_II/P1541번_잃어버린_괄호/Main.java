package BAEKJOON.Silver.Silver_II.P1541번_잃어버린_괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> num = new ArrayList<>();
    ArrayList<Character> pm = new ArrayList<>();
    
    String str = br.readLine();
    char c_temp;
    String s_temp = "";
    for(int i = 0; i < str.length(); i++){
      c_temp = str.charAt(i);
      if(c_temp == '+'){
        pm.add('+');
        num.add(Integer.parseInt(s_temp));
        s_temp = "";
      }
      else if(c_temp == '-'){
        pm.add('-');
        num.add(Integer.parseInt(s_temp));
        s_temp = "";
      }
      else
        s_temp += c_temp;        
    }
    num.add(Integer.parseInt(s_temp));

    int result = num.get(0);
    int minus = 0;
    
    for(int i = 0; i < pm.size(); i++){
      int num_get = num.get(i+1);
      char pm_get = pm.get(i);
      if(pm_get == '+'){
        if(minus > 0)
          minus += num_get;
        else
          result += num_get;
      }
      else if(pm_get == '-'){
        if(minus > 0){
          result -= minus;
          minus = 0;
        }
        minus += num_get;
      }
    }
    
    if(minus > 0)
      result -= minus;
    
    System.out.println(result);
  }
}