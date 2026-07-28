import java.util.Scanner;

public class Floydstriangle {
    public static void main(String args[]) {
        System.out.println("Enter the no. of rows you wish to print in the pattern: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + "");
                counter = counter + 1;

            }
            System.out.println(" ");

        }

    }
}
