import java.util.*;

public class sumofnnums {
    public static void main(String args[]) {
        int sum = 0;
        int i = 1;
        System.out.println("Enter the number upto which u want the sum of n numbers");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of n numbers is " + sum);
    }
}
