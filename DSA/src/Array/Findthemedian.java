package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Findthemedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        if(arr.length%2==1) System.out.println(arr[num/2]);
        else {
            System.out.println((arr[num/2])+(arr[num/2]-1)/2);
        }

//
//        if(num  % 2 == 1){
//            System.out.println(midin + 1);
//        }

//        System.out.println(arr[midin]);


    }
}
