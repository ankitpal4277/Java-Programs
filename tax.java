import java.util.*;

public class tax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in order to calculate your tax.");
        double income = sc.nextDouble();
        if (income <= 500000) {
            double tax = 0;
            System.out.println("Your tax is: " + tax);
        } else if (income > 500000 && income <= 1000000) {
            double tax = income * 0.2;
            System.out.println("Your tax is: " + tax);
        } else {
            double tax = income * 0.3;
            System.out.println("Your tax is: " + tax);
            System.out.println("Haha.. You got robbed bro...");
        }

    }
}