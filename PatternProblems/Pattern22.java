import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        int i = 1, n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (i <= n) {
            int space = 1;

            while (space <= (n - i)) {
                System.out.print(" ");
                space++;
            }

            int j = 1;
            while (j <= i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
