import java.util.Scanner;

public class print1ton {
    public static void main(String args[]) {
        System.out.println("Enter the number till which you wish to print the numbers from 1");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;

        while(i <= num){
            System.out.println(i);
            i++;
        }
    }
}
