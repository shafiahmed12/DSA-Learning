import java.util.*;

public class Patter12 {
    public static void main(String[] args) {
        int i = 1, n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (i <= n) {
            int j = 1;
            while (j <= n) {
                char ch = (char) ('A' + j - 1);
                System.out.print(ch + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

/*
 * A B C
 * A B C
 * A B C
 */