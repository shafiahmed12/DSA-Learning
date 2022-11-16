import java.util.*;

public class Pattern14 {
    public static void main(String[] args) {
        int i = 1, n;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print((char) ('A' + i + j - 2) + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

/*
 * A B C
 * B C D
 * C D E
 */