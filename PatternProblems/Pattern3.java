import java.util.*;

class Pattern3 {
    public static void main(String[] args) {
        int i = 1, n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

// Pattern 3
// 1 2 3 4
// 1 2 3 4
// 1 2 3 4
// 1 2 3 4