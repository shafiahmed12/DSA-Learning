import java.util.*;

public class Pattern11 {
    public static void main(String[] args) {
        int i = 1, n;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        while (i <= n) {
            char ch = (char)('A' + i -1);
            int j = 1;
            while (j <= n) {
                System.out.print(ch + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
/*
 A A A
 B B B
 C C C
 */