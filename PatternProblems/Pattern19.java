import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        int i = 1, n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (i <= n) {
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
