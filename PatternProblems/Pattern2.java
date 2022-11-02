import java.util.*;

class Pattern2 {
  public static void main(String[] atgs){
    int i=1, n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    while(i<= n){
      int j = 1;
      while(j <=n){
        System.out.print(i);
        j++;
      }
      System.out.println();
      i++;
    }
  }
}