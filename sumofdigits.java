import java.util.Scanner;

public class sumofdigits {
    public static void sumofdig(int n){
        int sum = 0;

        while(n > 0){
            int lastdigit = n % 10;
            sum = sum + lastdigit;
            n = n/ 10;
        }

        System.out.println("The sum of the digits of the entered integer is: " + sum);


    }

    public static void main(String args[]){
        System.out.println("Enter the num the sum of whose digits u wish to find: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sumofdig(n);
    }
}
