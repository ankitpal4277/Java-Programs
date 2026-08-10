public class largestnum {

    public static int largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }


            if(numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]) {
        int numbers[] = {1, 2, 6, 3, 5};

        System.out.println("The largest number in the array is: " + largest(numbers));

    }
}
