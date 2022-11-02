import java.util.*;

class PrintNumbers {
  public static void main(String[] args) {
    int i = 1, n;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number where you want to end ");
    n = sc.nextInt();

    while (i <= n) {
      System.out.print(i + " ");
      i++;
    }
  }
}