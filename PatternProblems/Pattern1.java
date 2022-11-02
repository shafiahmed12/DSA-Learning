import java.util.*;

class Pattern1 {
  public static void main(String[] args) {
    int n, i = 1;

    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    while (i <= n) {
      int j = 1;
      while (j <= n) {
        System.out.print("*");
        j++;
      }
      System.out.println();
      i++;
    }
  }
}