import java.util.*;

public class primeornot {
    public static void main(String args[]) {

        System.out.println("Enter the number u wish to check for primality");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }

        }
        if(isPrime == true) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }
}
