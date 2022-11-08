import java.util.*;

public class Pattern9 {
    public static void main(String[] args) {
        int i = 1, n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(i + j - 1 + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

/*
 * 1
 * 2 3
 * 3 4 5
 * 4 5 6 7
 */