package P15596번_정수_N개;

class Test {
  long sum(int[] a) {
    long sum = 0;

    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    return sum;
  }
}