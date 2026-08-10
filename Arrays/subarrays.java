public class subarrays {

    public static void subarrays(int numbers[]) {
        int overallMin = Integer.MAX_VALUE;
        int overallMax = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int minFromStart = Integer.MAX_VALUE;
            int maxFromStart = Integer.MIN_VALUE;

            for (int j = i; j < numbers.length; j++) {
                int sum = 0; // declared outside the k-loop, so it accumulates
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    sum = sum + numbers[k];
                }
                System.out.println("Sum: " + sum);

                // track min/max for subarrays starting at i
                if (sum < minFromStart) minFromStart = sum;
                if (sum > maxFromStart) maxFromStart = sum;

                // track min/max across the whole array
                if (sum < overallMin) overallMin = sum;
                if (sum > overallMax) overallMax = sum;
            }

            System.out.println("Starting at index " + i + ": min sum = " + minFromStart + ", max sum = " + maxFromStart);
            System.out.println();
        }

        System.out.println("Whole array: min sum = " + overallMin + ", max sum = " + overallMax);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        subarrays(numbers);
    }
}