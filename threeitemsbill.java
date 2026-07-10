import java.util.Scanner;

public class threeitemsbill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of pencil");
        double pencilPrice = sc.nextDouble();
        System.out.println("Enter the price of pen");
        double penPrice = sc.nextDouble();
        System.out.println("Enter the price of eraser");
        double eraserPrice = sc.nextDouble();
        double total = (pencilPrice + penPrice + eraserPrice);
        System.out.println("Total amount is: " + total);
        double tax = (0.18  * total);
        System.out.println(tax);
        double totalBill = (total + tax);
        System.out.println("Total bill with tax is: " + totalBill);

    }
}
