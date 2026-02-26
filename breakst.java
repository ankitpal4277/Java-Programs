import java.util.*;

public class breakst {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            System.out.println("You entered: " + n);
            if (n % 10 == 0) {
                break;
            }
        }

        System.out.println("You entered a number that is a multiple of 10. Exiting...");
    }
}
