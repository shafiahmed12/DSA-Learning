import java.util.*;

public class Pattern13 {
    public static void main(String[] args) {
        int i = 1, n;
        char ch = 'A';

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(ch + " ");
                j++;
                ch = (char) (ch + 1);
            }
            System.out.println();
            i++;
        }
    }
}

/*
 * A B C
 * D E F
 * G H I
 */