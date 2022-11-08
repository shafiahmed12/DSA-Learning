import java.util.*;

class Pattern5 {
    public static void main(String[] args) {
        int i = 1, n, count = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (i <= n) {

            int j = 1;

            while (j <= n) {
                count++;
                System.out.print(count + " ");
                j++;
            }

            System.out.println();
            i++;

        }
        sc.close();
    }
}

/*
 * 1 2 3
 * 4 5 6
 * 7 8 9
 */