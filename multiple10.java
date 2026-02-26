import java.util.*;

public class multiple10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number u wish to print: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println("You entered: " + n);

        }

    } }
