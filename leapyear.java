import java.util.*;

public class leapyear{
    public static void main(String args[]) {
        System.out.println("Enter the year u wish to check if it's a leap year or not");

        Scanner sc = new Scanner(System.in);
        long year = sc.nextLong();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0) {
                    System.out.println("The year u entered is a leap year");
                }

                else {
                    System.out.println("The year u entered is not a leap year");
                }

            
            }

            else {
                    System.out.println("The year u entered is a leap year");
                }
        }

        else {
                    System.out.println("The year u entered is not a leap year");
                }
    }
}