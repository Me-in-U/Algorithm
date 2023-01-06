package P3613번_JAVA_C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  protected static char[] input;
  protected static StringBuilder sb;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    input = br.readLine().toCharArray();
    sb = new StringBuilder();
    boolean is_cpp = check_cpp();
    boolean isJava = checkJava();
    if (isJava) {
      to_cpp();
      System.out.println(sb.toString());
    } else if (is_cpp) {
      toJava();
      System.out.println(sb.toString());
    } else {
      System.out.println("Error!");
    }
  }

  public static boolean check_cpp() {
    boolean underscore = false;
    if (!(input[0] >= 'a' && input[0] <= 'z')) {
      return false;
    }
    for (int i = 1; i < input.length; i++) {
      if (input[i] == '_') {
        if (underscore) {
          return false;
        } else {
          underscore = true;
        }
      } else if (input[i] >= 'a' && input[i] <= 'z') {
        underscore = false;
      } else {
        return false;
      }
    }
    return !underscore;
  }

  public static boolean checkJava() {
    if (!(input[0] >= 'a' && input[0] <= 'z')) {
      return false;
    }
    for (int i = 1; i < input.length; i++) {
      if (!((input[i] >= 'a' && input[i] <= 'z') || (input[i] >= 'A' && input[i] <= 'Z'))) {
        return false;
      }
    }
    return true;
  }

  public static void to_cpp() {
    for (int i = 0; i < input.length; i++) {
      if (input[i] >= 'A' && input[i] <= 'Z') {
        sb.append('_').append((char) (input[i] + 32));
      } else {
        sb.append(input[i]);
      }
    }
  }

  public static void toJava() {
    boolean toLower = false;
    for (int i = 0; i < input.length; i++) {
      if (input[i] == '_') {
        toLower = true;
      } else {
        if (toLower) {
          sb.append((char) (input[i] - 32));
          toLower = false;
        } else {
          sb.append(input[i]);
        }
      }
    }
  }
}