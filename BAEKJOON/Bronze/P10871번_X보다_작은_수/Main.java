package P10871번_X보다_작은_수;

import java.util.Scanner;
    
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int b = sc.nextInt();
      int arr[] = new int[num];
      for(int i = 0; i<num; i++){
          arr[i] = sc.nextInt();
      }
      for(int i = 0; i<num;i++){
          if(arr[i]<b)
              System.out.print(arr[i]+" ");
      }
      sc.close();
  }
}