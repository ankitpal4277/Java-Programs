import java.util.Scanner;

public class factofn {
    public static void main(String args[]) {
        int fact = 1;

        System.out.println("Enter the number whose factorial u wish to find out");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(; num >= 1; num--){
            fact = fact * num;
        }

        System.out.println("The factorial of this number is : " + fact);
    }
}
