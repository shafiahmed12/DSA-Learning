import java.util.Scanner;

public class Pattern23 {
    public static void main(String[] args) {
        int i = 1, n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(i <=n){
            int space =1;
            while(space<=i-1){
                System.out.print(" ");
                space++;
            }

            int start = i;
            int j =1;
            while(j<=n-i+1){
                System.out.print(start);
                start++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
