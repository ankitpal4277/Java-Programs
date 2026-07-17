import java.util.Scanner;

public class palindrome {
    public static void pal(int n){
        int rev = 0;
        int pow = 0;
        int num = n;


        while(n > 0){
            int lastdigit = n % 10;
            rev = rev * 10 + lastdigit;
            pow++;
            n = n/10;

        }

        if(num == rev){
            System.out.println("The entered number is palindrome");
        }else{
            System.out.println("The entered number is not a palindrome");
        }

    }

    public static void main(String args[]){
        System.out.println("Enter the number for which you wish to check if its a Palindrome or not: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pal(n);

    }
}
