package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Move_Negatives_to_one_Side_of_Array {

    static   void  MainFunction(int start , int end , int arr[]){

    while (start < end){
        while (arr[start] < 0 )start++;
        while (arr[end] > 0 ) end--;

        if (start > end) break;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]=temp;
    }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        int start = 0;
        int end = num -1;
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        MainFunction(0 , num-1 , arr);
        System.out.println(Arrays.toString(arr));

    }
}
