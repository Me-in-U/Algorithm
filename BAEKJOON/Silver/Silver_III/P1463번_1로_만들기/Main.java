package P1463번_1로_만들기;

import java.util.Scanner; 
class Main {
  static int dp[] =new int[1000001];
  static int before[] = new int[1000001];
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    System.out.println(solve(n));
    /*
    while(n!=0){
      System.out.print(n + " ");
      n = before[n];
    }
    */
  }
  
  static int solve(int n){
    dp[1] = 0;
    for (int i = 2; i <= n; i++){
	  	// -1
  		dp[i] = dp[i - 1] + 1;
	  	before[i] = i - 1;
  		// 3으로 나누기
	  	if (i % 3 == 0){
  		  if (dp[i] > dp[i / 3] + 1){
			  	dp[i] = dp[i / 3] + 1;
			  	before[i] = i / 3;
		   	}
	  	}
	  	// 2로 나누기
		  if (i % 2 == 0){
		  	if (dp[i] > dp[i / 2] + 1){
			  	dp[i] = dp[i / 2] + 1;
			  	before[i] = i / 2;
		  	}
		  }
  	}
    return dp[n];
  }
}