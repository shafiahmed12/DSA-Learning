import java.util.*;

class Pattern4 {
    public static void main(String[] args) {
        int row = 1, n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (row <= n) {

            int j = 1;

            while (j <= n) {
                System.out.print(n - j + 1 + " ");
                j++;
            }
            System.out.println();
            row++;
        }
    }
}

// Pattern 4
// 3 2 1
// 3 2 1
// 3 2 1
