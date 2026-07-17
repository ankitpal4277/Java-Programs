import java.util.Scanner;

public class bintodec {
    public static void bintodec(int binnum){
        int pow = 0;
        int decnum = 0;
        int num = binnum;

        while(num > 0){
            int lastdigit = num % 10;
            decnum = decnum + (lastdigit * (int)Math.pow(2, pow));

            pow++;
            num = num/10;
        }

        System.out.println("decimal of " + binnum + " = " + decnum);
    
    }

    public static void main(String args[]){
        System.out.println("Enter the binary number u wish to convert into decimal: ");
        Scanner sc = new Scanner(System.in);
        int binnum = sc.nextInt();

        bintodec( binnum);
    }
}
