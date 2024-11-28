package Array;

public class LargeNum {

    public static int FindLargeNum(int array[]) {
        int large = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (large < array[i]) {
                large = array[i];
            }
        }

        return large;
    }

    public static void main(String[] args) {
        int array[] = {10, 50, 60, 40, 20, 70};

        System.out.println("The largest value in the array is " + FindLargeNum(array));
    }
}
