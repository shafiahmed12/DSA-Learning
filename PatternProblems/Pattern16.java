import java.util.*;

public class Pattern16 {
    public static void main(String[] args) {
        int i = 1, n;
        char ch = 'A';

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(ch + " ");
                ch = (char) (ch + 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
