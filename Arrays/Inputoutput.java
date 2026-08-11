import java.util.*;

public class Inputoutput {
    public static void main(String args[]){
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Physics marks is: " + marks[0]);
        System.out.println("Chemistry marks is: " + marks[1]);
        System.out.println("Maths marks is: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;

        System.out.println("Percentage of total marks scored is: " + percentage + "%");

        // marks[2] = 100;
        marks[2] = marks[2] + 1;

        percentage = (marks[0] + marks[1] + marks[2]) / 3;


        System.out.println("Updated marks of Maths is: " + marks[2]);

        System.out.println("Updated Percentage of total marks scored is: " + percentage + "%");

        System.out.println("The length of the marks array is: " + marks.length);

    }
}
