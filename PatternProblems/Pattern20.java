import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args){
        int i = 1, n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(i<=n){
            int j = 1;
            int space = 1;
            while(space <= i-1){
                System.out.print(" ");
                space++;
            }

            while(j<=n-i+1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
