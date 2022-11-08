import java.util.*;

public class Pattern10 {
    public static void main(String[] args) {
        int i = 1, n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (i <= n) {
            int j = 1;

            while (j <= i) {
                System.out.print(i - j + 1 + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

/*
 * 1
 * 2 1
 * 3 2 1
 * 4 3 2 1
 */