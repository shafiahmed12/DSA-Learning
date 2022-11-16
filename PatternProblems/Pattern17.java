import java.util.*;

public class Pattern17 {
    public static void main(String[] args) {
        int i = 1, n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (i <= n) {
            int j = 1;
            char start = (char) ('A' + n - i);
            while (j <= i) {
                System.out.print(start + " ");
                start++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
