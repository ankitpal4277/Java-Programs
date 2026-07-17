import java.util.Scanner;

public class dectobin {
    public static void decToBin(int n){
        int pow = 0;
        int binnum = 0;
        int num = n;

        while(n > 0){
            int rem = n % 2;
            binnum = binnum + (rem * (int)Math.pow(10, pow));

            pow++;
            n = n/2;
        }

        System.out.println("Binary form of " + num + " is:  " + binnum); 

    }

    public static void main(String args[]){
        System.out.println("Enter the Decimal number you wish to convert to Binary");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        decToBin(n);
    }
}
