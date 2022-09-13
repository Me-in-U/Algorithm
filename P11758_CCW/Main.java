package P11758_CCW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
  public static int x[] = new int[3];
  public static int y[] = new int[3];
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		for(int i = 0; i < 3; i++){
      st = new StringTokenizer(br.readLine());
      x[i] = Integer.parseInt(st.nextToken());
      y[i] = Integer.parseInt(st.nextToken());
		}
    System.out.println(CCW());
	}
  public static int CCW(){
    //(x2 - x1)(y3 - y1) - (x3 - x1)(y2 - y1) = (x1y2 + x2y3 + x3y1) - (x2y1 + x3y2 + x1y3)
    int CCW_result = ((x[1]-x[0])*(y[2]-y[0])) - ((x[2]-x[0])*(y[1]-y[0]));
    if(CCW_result < 0)
      return -1;
    else if (CCW_result > 0)
      return 1;
    else
      return 0;
  }
}