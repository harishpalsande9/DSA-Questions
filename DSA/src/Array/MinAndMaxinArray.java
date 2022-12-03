package Array;

import java.util.Scanner;

public class MinAndMaxinArray {

    public static int[] Minmax(int arr[]){

        int arr1 [] = new int[2];

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i]>max){
                max = arr[i];
            }
            if ( arr[i]<min){
                min = arr[i];
            }
            arr1[0]=min;
            arr1[1]=max;
        }

        return arr1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]=sc.nextInt();
        }

        Minmax(arr);
        for (int x:Minmax(arr)) {
            System.out.println(x + " ");
        }
    }
}
