package BAEKJOON.Silver.Silver_V.P4673번_셀프넘버;

public class Main {
   public static void main(String args[]){
      StringBuilder sb = new StringBuilder();

      boolean not_Self_num[] = new boolean[10001];
      for(int i = 1; i <= 10000; i++) {
         int n = not_Self_num_check(i);
         if (n <= 10000)
            not_Self_num[n] = true;
      }
      for(int i = 1; i <= 10000; i++) {
         if (!not_Self_num[i])
            sb.append(i).append('\n');
      }
      System.out.println(sb.toString());
   }
   public static int not_Self_num_check(int a){
      int num = a;
      
      while (a != 0) {
         num += (a % 10);
         a = a / 10;
      }
      return num;
   }
}