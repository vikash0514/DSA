package Array;

public class ReverseArray {
 

    public static void Reverse(int number[]){
 int start=0,  int end=number.length-1;

   while (start<end) {
    int temp=number[end];
    number[end]=number[start];
    number[start]=temp;

    start++;
    end--;
    
   }


    }


    public static void main(String[] args) {

        int number[]={1,2,3,4,5,6,7,8,9};
        
    }
    
}
