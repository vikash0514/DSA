package Array;

public class PlusSumArray {

    public static void AddSubArray(int number[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                int currentSum = 0;

                for (int k = i; k <= j; k++) {
                    currentSum += number[k];
                }

                System.out.println("Subarray sum: " + currentSum);

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        AddSubArray(number);
    }
}
