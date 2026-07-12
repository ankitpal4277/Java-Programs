import java.util.Scanner;

public class passorfail {
    public static void main(String args[]) {
        System.out.println("Please enter your marks out of 100");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();

        if(num >= 33){
            System.out.println("Congratulations.. you have passed the exam");
        }

        else {
            System.out.println("You got smoked bro...");
        }
    }
}
