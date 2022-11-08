import java.util.*;

public class Pattern6 {
    public static void main(String[] args) {
        int row = 0, n;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}

/*
 *
 * *
 * * *
 * * * *
 */
