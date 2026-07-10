import java.util.*;

public class threenumaverage {
    public static void main(String args[]) {
        System.out.println("Enter the three numbers of which you want to find the average");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double average = (a + b + c) / 3.0;
        System.out.println("The average of the three numbers is: " + average);
    }
}