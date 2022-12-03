package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseanArray_2 {
    static void ReverseanArray(int start , int end, int arr[]){


        while(start <= end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]=sc.nextInt();
        }

        ReverseanArray(0 , num-1,arr);
        System.out.println(Arrays.toString(arr));
    }
}
