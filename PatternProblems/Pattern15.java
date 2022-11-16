import java.util.*;

public class Pattern15 {
    public static void main(String[] args) {
        int i = 1, n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (i <= n) {

            int j = 1;
            while (j <= i) {
                System.out.print((char) ('A' + i - 1) + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
