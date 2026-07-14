import java.util.Scanner;

public class binomialcoefficient {

    public static int fact(int num) {
        int result = 1;
        for (int i = num; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }

    public static int binocoeff(int n, int r) {
        int a = fact(n);
        int b = fact(r);
        int c = fact(n - r);
        return a / (b * c);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of r");
        int r = sc.nextInt();

        int binco = binocoeff(n, r);
        System.out.println("Binomial coefficient: " + binco);
    }
}