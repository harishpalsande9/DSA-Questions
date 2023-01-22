package Array;
import java.util.*;

public class subarrraysumzero {
    static void zeroSubarray(int[] arr) {
//        System.out.println("Helllo");

        int size = arr.length;
        int countZerSumArray = 0;


        for(int i = 0 ; i < size ; i++){
            int sum = 0 ;
            for(int j = i ; j < size ; j++){
                sum = sum + arr[j];
//                System.out.println(sum + "sum");

                if(sum == 0){
                    countZerSumArray++;
                    System.out.println("Subarray found from Index " + i + " to " + j);
                }
            }
        }

        if(countZerSumArray == 0)
        {
            System.out.println("-1");
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        zeroSubarray(arr);
        sc.close();
    }
}