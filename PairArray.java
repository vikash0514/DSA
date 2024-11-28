package Array;

public class PairArray {

    public static void PairsOfAllArray(int[] number) {
        int TotalPairs = 0;

        for (int i = 0; i < number.length; i++) {
            int currentNo = number[i];

            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + currentNo + "," + number[j] + ") ");
                TotalPairs++;
            }
            System.out.println();
        }

        System.out.println("Total pairs: " + TotalPairs);
    }

    public static void main(String[] args) {
        int[] number = {2, 4, 6, 8, 10};
        PairsOfAllArray(number);
    }
}
