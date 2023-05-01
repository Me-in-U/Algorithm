package P12904번_A와_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static String S;
  public static String T;
  public static boolean is_reversed;
  public static int front_index;
  public static int back_index ;
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		S = br.readLine();
    T = br.readLine();
    is_reversed = false;
    front_index = 0;
    back_index = T.length() - 1;

    //길이가 다르면 반복
    //뒷쪽 index가 'A'면 'A'제거
    //뒷쪽 index가 'B'면 'B'제거 후 reverse
    while(S.length() != (back_index - front_index + 1)){      
      if(T.charAt(check_AB()) == 'A'){
        remove();
      }
      else{
        remove();
        reverse();
      }
    }

    //equals 확인 전,
    //reverse라면 index 구간 실제 T 뒤집어주기
    //reverse아니면 index 구간 자르기
    if(is_reversed){
      String temp = "";
      for(int i = back_index; i >= front_index; i--){
        temp += T.charAt(i);
      }
      T = temp;
    }
    else{
      T = T.substring(front_index, back_index + 1);
    }

    //equals 확인 후 출력
    if(S.equals(T)){
      System.out.println("1");
    }   
    else{
      System.out.println("0");   
    } 
	}
  public static void remove(){
    if(is_reversed)
      front_index++;    
    else
      back_index--;    
  }
  public static void reverse(){
    if(is_reversed)
      is_reversed = false;    
    else
      is_reversed = true;    
  }
  public static int check_AB(){
    if(is_reversed)
      return front_index;    
    else
      return back_index;    
  }
}