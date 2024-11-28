package Array;

// import java.util.Scanner;

// public class LinearSearch {

//     public static int linearSearch(int[] arr, int target) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size of the array:");
//         int n = sc.nextInt();

//         int[] array = new int[n];

//         System.out.println("Enter the " + n + " elements of the array:");
//         for (int i = 0; i < n; i++) {
//             array[i] = sc.nextInt();
//         }

//         System.out.println("Enter the target element to search:");
//         int target = sc.nextInt();

//         int result = linearSearch(array, target);

//         if (result != -1) {
//             System.out.println("Element found at index: " + result);
//         } else {
//             System.err.println("Element not found.");
//         }

//         sc.close();
//     }
// }

// REWITE PROGRAM 

import java.util.Scanner;

public class LinearSearch{

    public static int rewrite(int arr[], int target){
        for(int i=0; i<arr.length; i++){

            if (arr[i]==target) {

                return i;
                
            }
            else return -1;
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array");

        int n = sc.nextInt();

        int array[] = new int[n];

        System.out.println("Enter the "+n+"Element of Array");

        for(int i=0; i<n; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter The target Element of arrat");

        int target = sc.nextInt();

        int result = rewrite(array, target);

        if (result!=-1){
            System.out.println("Element index number is "+result);
        }
        else{
            System.out.println("Not");
        }

        sc.close();
    }
}