package Array;

public class Subarray {

    public static void FindSubArray(int number[]){

        int Ts=0;

        for(int i=0; i<=number.length; i++)
        {
            int start=i;

            for(int j=i;j<=number.length; j++){

               int end=j;

                for( int k=start; k<=end; k++)
                {
                    System.out.print( number[k] + " ");

                    Ts++;
                }
                System.out.println();
            }
            System.out.println(Ts);
        }
    }


    public static void main(String[] args) {
        int number[]={2,4,6,8,10};

        FindSubArray(number);
    }
    
}
