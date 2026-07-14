import java.util.Scanner;

public class swapab{
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        System.out.println("Original value of a is " + a);
        System.out.println("Original value of b is " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Current value of a is " + a);
        System.out.println("Current value of b is " + b);

    }
}
