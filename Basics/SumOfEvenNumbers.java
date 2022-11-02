import java.util.*;

class SumOfEvenNumbers {
  public static void main(String[] args) {
    int i = 2, n, sum = 0;
    System.out.println("Give the value of n");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    while (i <= n) {
      if (i % 2 == 0) {
        sum = sum + i;
      }
      i = i + 2;
    }
    System.out.println("the sum of all even numbers is " + sum);
  }
}