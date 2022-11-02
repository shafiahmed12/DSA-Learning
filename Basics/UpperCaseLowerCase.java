import java.util.*;

class UpperCaseLowerCase {
  public static void main(String[] args) {
    char ch;
    System.out.println("please give some charecter");
    Scanner sc = new Scanner(System.in);
    ch = sc.next().charAt(0);

    if (ch <= 57 && ch >= 48) {
      System.out.println("The given charecter is a number between 0 and 9");
    } else if (ch >= 65 && ch <= 90) {
      System.out.println("The given charecter is an upperCase letter");
    } else if (ch >= 97 && ch <= 122) {
      System.out.println("The given charecter is an lowerCase letter");
    }
    else {
      System.out.println("The given charecter is a special charecter");
    }
  }
}