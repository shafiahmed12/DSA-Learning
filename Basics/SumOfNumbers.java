import java.util.*;

class SumOfNumbers {
  public static void main(String[] args) {
    int i = 0, n, sum = 0;
    System.out.println("please enter the number");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    while (i <= n) {
      sum = sum + i;
      i++;
    }
    System.out.println("sum of " + n + " numbers is :" + " " + sum);
  }
}