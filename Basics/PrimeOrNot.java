import java.util.*;

class PrimeOrNot {
  public static void main(String[] args) {
    int i = 2, n;
    System.out.println("Enter the number to check if it's prime or not");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    while (i < n) {
      if (n % i == 0) {
        System.out.println("The given number is not a prime number");
      }
      i++;
    }
  }
}